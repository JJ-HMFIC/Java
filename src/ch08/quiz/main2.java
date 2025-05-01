package ch08.quiz;

public class main2 {
    public static void main(String[] args) {
        Payment payment = new KakaoPay();
        payment.pay(3000);       // 실패 케이스
        payment.pay(7000);       // 성공 케이스
        payment.approve();
        payment.cancel("오입력");
    }
}
