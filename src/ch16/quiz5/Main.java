package ch16.quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        list.add(new Goods("메타몽 쿠션", 20000, 0.1));
        list.add(new Goods("메타몽 키링", 8000, 0.05));
        list.add(new Goods("메타몽 인형", 15000, 0.2));
        list.add(new Goods("메타몽 노트북 파우치", 30000, 0.2));
        list.add(new Goods("메타몽 가방", 40000, 0.2));


        List<Goods> seul = List.of(
                list.get(0), // 쿠션
                list.get(1), // 키링
                list.get(2)  // 인형
        );

        List<Goods> jiwoo = List.of(
                list.get(3), // 파우치
                list.get(4)  // 가방
        );


        ToIntFunction<Goods> discountedPrice = g -> (int) g.getDiscountedPrice();
        printCart("이슬이", seul, discountedPrice);
        printCart("지우", jiwoo, discountedPrice);

    }
    public static void printCart(String user, List<Goods> cart, ToIntFunction<Goods> discountCalc) {
        System.out.println("[" + user + "의 장바구니]");
        int total = 0;

        for (Goods g : cart) {
            int discounted = discountCalc.applyAsInt(g);
            System.out.println("- " + g.getName() + ": " + discounted + "원");
            total += discounted;
        }

        System.out.println("총합: " + total + "원\n");
    }
}
