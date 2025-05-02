package ch08.quiz6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentManager pm = new PaymentManager();


        while (true) {
            System.out.println("=== 유니페이 결제 시스템 ===");
            System.out.println("[1] 신용카드");
            System.out.println("[2] 카카오페이");
            System.out.println("[0] 종료");
            System.out.print("결제 수단을 선택하세요: ");

            int choice = sc.nextInt();
            if (choice == 0) break;

            Payment payment = null;

            if (choice == 1) payment = new CreditCard();
            else if (choice == 2) {
                payment = new KakaoPay();
                System.out.print("[카카오페이 사용자 인증을 진행하시겠습니까? (y/n)]\n>> ");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("y")) {
                    ((KakaoPay) payment).authenticate();
                }
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;

            }

            if(!payment.beforePay()) {
                System.out.println("[결제 실패: 준비 단계에서 중단]");
                System.out.println();
                continue; // 결제 실패 시 다음 반복으로
            }

            // ✅ 준비 완료된 경우에만 금액 입력
            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();

            // ✅ 결제 처리 위임
            pm.process(payment, amount);
            System.out.println();
        }

        pm.printSummary();
        sc.close();
    }
}
