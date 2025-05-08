package ch17.quiz1.step6;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategorySummaryReport {
    public static void run() {
        List<GiftItem> gifts = GiftRepository.getGifts();

        Map<String, List<GiftItem>> collect = gifts.stream()
                .collect(Collectors.groupingBy(GiftItem::getCategory));

        DecimalFormat df = new DecimalFormat("₩###,###원");

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📦 카테고리별 선물 요약 리포트");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        for (String category : collect.keySet()) {

            List<GiftItem> list = collect.get(category);

            int size = list.size();
            double avg = list.stream().mapToInt(GiftItem::getPrice).average().orElse(0.0);
            int max = list.stream().mapToInt(GiftItem::getPrice).max().orElse(0);
            int min = list.stream().mapToInt(GiftItem::getPrice).min().orElse(0);


            System.out.println("[" + category + "]");
            System.out.printf("  - 총 개수     : %d개\n", size);
            System.out.printf("  - 평균 가격   : %s\n", df.format((int) avg));
            System.out.printf("  - 최고가      : %s\n", df.format(max));
            System.out.printf("  - 최저가      : %s\n\n", df.format(min));
        }

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("리포트 생성 완료 ✅");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
