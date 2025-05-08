package ch17.quiz1.step2;

import ch17.quiz1.data.GiftRepository;
import ch17.quiz1.model.GiftItem;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryCountReport {
    public static void run() {
        List<GiftItem> gifts = GiftRepository.getGifts();

        System.out.println("\uD83D\uDCE6 카테고리별 선물 개수 요약");
        gifts.stream().collect(
                Collectors.groupingBy(GiftItem::getCategory, Collectors.counting()))
                .forEach((key,value)-> System.out.println(key + ": " + value+"개"));
    }
}
