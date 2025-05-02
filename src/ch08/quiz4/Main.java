package ch08.quiz4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("=== 유니페이 결제 시스템 ===\n" +
                "[1] 신용카드\n" +
                "[2] 카카오페이\n" +
                "결제 수단을 선택하세요: ");


        int N = sc.nextInt();

        Payment payment = null;

        if (N == 1) payment = new CreditCard();
        else if (N == 2) payment = new KakaoPay();
        else {
            System.out.println("잘못된 선택입니다. 프로그램 종료.");
            sc.close();
            return;
        }

        if (payment instanceof KakaoPay) {
            System.out.print("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)] \n");
            String command = sc.next();
            if (command.equalsIgnoreCase("y")) {
                ((KakaoPay) payment).authenticate();
            }
        }

        boolean check = payment.beforePay();
        if (!check) {
            System.out.println("[결제 실패: 준비 단계에서 중단]");
            sc.close();
            return;
        }
        System.out.print("결제 금액을 입력하세요: ");
        int amount = sc.nextInt();
        boolean success = payment.pay(amount);


        if (success) {
            payment.approve();
            payment.cancel("테스트 취소");

            if (payment instanceof KakaoPay) {
                ((KakaoPay) payment).sendNotification();
            } else {
                System.out.println("[알림 서비스 없음]");
            }
        }

    }


}
