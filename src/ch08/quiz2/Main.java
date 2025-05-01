package ch08.quiz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCard(),
                new KakaoPay(),
                new KakaoPay(),
                new CreditCard()
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < payments.length; i++) {
            System.out.print("["+(i+1)+"번 결제수단] 결제 금액을 입력하세요:\n>>");
            int amount = sc.nextInt();
            if (payments[i].pay(amount)) {
                payments[i].approve();
                payments[i].cancel("테스트 취소");
            }
            System.out.println();

        }
    }

}
