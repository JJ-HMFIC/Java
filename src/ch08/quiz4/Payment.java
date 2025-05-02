package ch08.quiz4;

public interface Payment {

    boolean pay(int amount);
    void approve();
    void cancel(String reason);
    default boolean beforePay() {
        System.out.println("[공통] 결제를 준비합니다...");
        return true;
    }
}
