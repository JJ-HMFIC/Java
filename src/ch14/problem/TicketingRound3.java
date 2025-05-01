package ch14.problem;

public class TicketingRound3 {
    public static void main(String[] args) {
        int ticketCount = 5;
        EntryManager entryManager = new EntryManager(ticketCount);
        Fan[] fans = {
                new Fan("팬1", false, entryManager),
                new Fan("팬2", true, entryManager),
                new Fan("팬3", false, entryManager),
                new Fan("팬4", true, entryManager),
                new Fan("팬5", false, entryManager)
        };
        System.out.println("\"이벤트 시작! 남은 티켓: " + ticketCount + "장\"");

        Thread[] threads = new Thread[ticketCount];
        for (int i = 0; i < ticketCount; i++) {
            threads[i] = new Thread(fans[i]);
            threads[i].start();
        }
        for (Thread fan : threads) {
            try {
                fan.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\"이벤트 종료! 모두 수고하셨습니다 \uD83C\uDF89\"");
    }
}
