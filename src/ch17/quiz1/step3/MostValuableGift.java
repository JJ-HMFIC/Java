package ch17.quiz1.step3;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostValuableGift {
    public static void run(boolean momMode) {
        List<GiftItem> gifts = GiftRepository.getGifts();
        System.out.println("\uD83D\uDC8E 부모님께 드릴 수 있는 최고의 프리미엄 선물");

        Optional<GiftItem> max = gifts.stream().filter(giftItem -> {
            if (momMode) {
                return giftItem.isForMom();
            } else {
                return giftItem.isForDad() && giftItem.getPreferenceScore() >= 90;
            }
        }).max(Comparator.comparingInt(GiftItem::getPrice));

        if (max.isEmpty()) {
            System.out.println("\uD83D\uDE22 조건에 맞는 고가의 선물을 찾지 못했어요.");
        } else {
            if (momMode) {
                System.out.print("\uD83D\uDC9D");
            }else {
                System.out.print("\uD83C\uDF81");
            }
            System.out.println("[" + max.get().getName() + "] - "
                    + max.get().getCategory() + " (₩" + max.get().getPrice() +
                    ") / 선호도: " + max.get().getPreferenceScore() + "점");
        }

    }
}
