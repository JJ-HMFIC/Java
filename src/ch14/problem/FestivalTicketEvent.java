package ch14.problem;

public class FestivalTicketEvent extends AbstractTicketEvent {

    public FestivalTicketEvent(int ticketCount) {
        super(ticketCount);
    }

    @Override
    protected void fanEntry() {
        Thread[] fans = new Thread[ticketCount];
        for (int i = 0; i < ticketCount; i++) {
            int fanNumber = i + 1;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "티켓 구매 시도 중!");
                }
            };

            Thread thread = new Thread(runnable);
            thread.setName("팬" + fanNumber);
            thread.start();
            fans[i] = thread;
        }
        for (Thread fan : fans) {
            try {
                fan.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
