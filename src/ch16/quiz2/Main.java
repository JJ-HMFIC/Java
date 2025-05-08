package ch16.quiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static final List<Goods> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add(new Goods("메타몽 쿠션", "분홍", false));
        list.add(new Goods("메타몽 노트북 파우치", "보라", true));
        list.add(new Goods("메타몽 인형", "분홍", false));
        list.add(new Goods("메타몽 가방", "회색", true));
        list.add(new Goods("메타몽 키링", "파랑", false));


        printSelectedGoods("이슬이", t -> t.getColor().equals("분홍"));
        System.out.println();

        printSelectedGoods("지우", t -> t.isUseful());

    }

    public static void printSelectedGoods(String user, Predicate<Goods> filter) {
        System.out.println("[" + user + "의 선택]");
        for (Goods goods : list) {
            if (filter.test(goods)) {
                System.out.println("- " + goods.getName());
            }
        }
    }
}
