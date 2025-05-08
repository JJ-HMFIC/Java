package ch17.quiz1.step4;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.text.DecimalFormat;
import java.util.List;
import java.util.OptionalDouble;

public class MomGiftAveragePrice {
    public static void run() {
        List<GiftItem> gifts = GiftRepository.getGifts();

        OptionalDouble result = gifts.stream().filter(s -> s.isForMom() && s.getPreferenceScore() >= 70)
                .mapToInt(GiftItem::getPrice).average();
        if(result.isEmpty()) {
            System.out.println("\uD83D\uDE2D 조건에 맞는 엄마 전용 선물이 아직 없습니다.");
            return;
        }else {
            System.out.println("\uD83D\uDC69 엄마 전용 선물들의 평균 가격 리포트");
            System.out.println("\uD83D\uDCE6 포함된 선물:");

            gifts.stream().filter(s -> s.isForMom() && s.getPreferenceScore() >= 70)
                    .map(GiftItem::getName).forEach(s -> System.out.println("- " + s));

            DecimalFormat df = new DecimalFormat("₩###,###");
            System.out.println("\uD83D\uDCCA 평균 가격: "+ df.format(Math.ceil(result.getAsDouble()))+"원");

        }
    }
}
