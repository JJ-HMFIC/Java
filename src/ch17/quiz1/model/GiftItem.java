package ch17.quiz1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GiftItem {
    private String name;
    private String category;
    private int price;
    private int preferenceScore; // 1~100
    private boolean forMom;
    private boolean forDad;

    // 생성자, Getter 생략
}
