package ch16.quiz5;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Goods {
    private String name;
    private int price;         // 정가
    private double discount;   // 할인율 (예: 0.2 = 20%)

    public double getDiscountedPrice() {
        return this.price * (1 - this.discount);
    }
}
