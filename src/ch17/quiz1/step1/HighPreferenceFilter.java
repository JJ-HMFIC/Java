package ch17.quiz1.step1;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.util.List;

public class HighPreferenceFilter {
    public static void run() {
        List<GiftItem> gifts = GiftRepository.getGifts();
        System.out.println("\uD83C\uDF81 부모님이 진짜 좋아하시는 선물 리스트");
        gifts.stream().filter(score -> score.getPreferenceScore() >= 70)
                .map(s -> s.getName()).forEach(System.out::println);
    }
}
