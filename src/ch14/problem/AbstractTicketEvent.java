package ch14.problem;

public abstract class AbstractTicketEvent {
    protected int ticketCount;

    public AbstractTicketEvent(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public final void startEvent() {
        openAnnouncement();
        fanEntry(); // 자식 클래스 구현
        closingAnnouncement();
    }

    private void openAnnouncement() {
        System.out.println("이벤트 시작! 남은 티켓: " + ticketCount + "장");
    }

    protected abstract void fanEntry();

    private void closingAnnouncement() {
        System.out.println("이벤트 종료! 모두 수고하셨습니다 🎉");
    }


}
