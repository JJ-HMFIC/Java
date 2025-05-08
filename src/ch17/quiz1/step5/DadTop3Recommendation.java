package ch17.quiz1.step5;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.text.DecimalFormat;
import java.util.List;

public class DadTop3Recommendation {
    public static void run() {
        List<GiftItem> gifts = GiftRepository.getGifts();

        List<GiftItem> list = gifts.stream().filter(GiftItem::isForDad).
                sorted((s1, s2) -> s2.getPreferenceScore() - s1.getPreferenceScore())
                .limit(3).toList();
        if (list.isEmpty()) {
            System.out.println("\uD83D\uDE2D 아빠를 위한 추천 선물이 없습니다.");
            return;
        } else {
            DecimalFormat df = new DecimalFormat("₩###,###");

            int maxPrice = list.stream().mapToInt(GiftItem::getPrice).max().orElse(0);
            int minPrice = list.stream().mapToInt(GiftItem::getPrice).min().orElse(0);

            System.out.println("🎁 아빠가 좋아하실 감동 추천 Top 3");

            int totalScore = 0;
            int totalPrice = 0;

            for (int i = 0; i < list.size(); i++) {
                GiftItem item = list.get(i);

                String name = item.getName();

                String category = item.getCategory();

                int price = item.getPrice();

                int preferenceScore = item.getPreferenceScore();

                int reputation = preferenceScore / 20;
                String star = "★★★★★".substring(0, reputation)
                        + "☆☆☆☆☆".substring(0, 5 - reputation);

                String badge = "";
                if (price == maxPrice) badge += " 💎";
                if (price == minPrice) badge += " 💸";

                totalScore += preferenceScore;
                totalPrice += price;


                System.out.printf("%d. [%s] - %s / %s원 / 선호도: %d점 (%s)%s\n",
                        i + 1,
                        name,
                        category,
                        df.format(price),
                        preferenceScore,
                        star,
                        badge
                );
            }
            double avgScore = (list.isEmpty()) ? 0.0 : (double) totalScore / list.size();
            double avgPrice = (list.isEmpty()) ? 0.0 : (double) totalPrice / list.size();


            System.out.println();
            System.out.printf("📊 평균 선호도: %.1f점\n", avgScore);
            System.out.printf("📊 평균 가격: %s\n", df.format(avgPrice));

        }


    }
}
