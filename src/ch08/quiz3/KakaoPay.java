package ch08.quiz3;

public class KakaoPay implements Payment{
    int amount;
    @Override
    public boolean pay(int amount) {
        if (amount < 5000) {
            System.out.println("[카카오페이] 결제 실패: 최소 결제 금액은 5000원입니다.");
            System.out.println("[결제 실패: 승인/취소 건너뜀]");
            return false;
        } else {
            System.out.println("[카카오페이] " + amount + "원 결제 성공");
            this.amount = amount;
            return true;
        }
    }

    @Override
    public void approve() {

    }

    @Override
    public void cancel(String reason) {

    }
}
