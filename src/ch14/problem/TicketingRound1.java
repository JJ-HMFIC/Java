package ch14.problem;

public class TicketingRound1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"티켓 구매 시도 중!");
            }
        });
        thread1.setName("팬1");


        Thread thread2 =  new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"티켓 구매 시도 중!");
            }
        });
        thread2.setName("팬2");

        thread1.run();
        thread2.run();
        thread1.start();
        thread2.start();


    }
}
