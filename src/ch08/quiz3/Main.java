package ch08.quiz3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("=== 결제 수단 선택 ===\n" +
                "[1] 신용카드\n" +
                "[2] 카카오페이\n" +
                "결제 수단을 선택하세요: ");
        int card = sc.nextInt();
        System.out.print("금액: ");
        int amount = sc.nextInt();
        Payment payment = null;

        if (card == 1) payment = new CreditCard();
        else if (card == 2) payment = new KakaoPay();

        if (payment.pay(amount)) {
            payment.approve();
            payment.cancel("테스트 취소");

            if (payment instanceof KakaoPay) {
                sendNotification();
            } else {
                System.out.println("[알림 서비스 없음]");
            }
        }
    }

    public static void sendNotification() {
        System.out.println("[카카오페이] 결제 알림이 전송되었습니다!");
    }
}
