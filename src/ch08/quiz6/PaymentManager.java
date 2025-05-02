package ch08.quiz6;

public class PaymentManager {
    private int totalCount = 0;
    private int totalAmount = 0;

    private int creditCardCount = 0;
    private int kakaoPayCount = 0;

    public void process(Payment payment, int amount) {
        if (!payment.beforePay()) {
            System.out.println("[결제 실패: 준비 단계에서 중단]");
            return;
        }
        if (payment.pay(amount)) {
            payment.approve();
            payment.cancel("테스트 취소");

            if (payment instanceof KakaoPay) {
                ((KakaoPay) payment).sendNotification();
                kakaoPayCount++;
            } else {
                System.out.println("[알림 서비스 없음]");
                creditCardCount++;
            }
            totalCount++;
            totalAmount += amount;
        }
    }

    public void printSummary() {
        System.out.println("\n✅ 결제 통계 요약");
        System.out.println("총 결제 횟수: " + totalCount + "회");
        System.out.println("총 결제 금액: " + totalAmount + "원");
        System.out.println("[CreditCard] : " + creditCardCount + "건");
        System.out.println("[KakaoPay] : " + kakaoPayCount + "건");
    }
}
