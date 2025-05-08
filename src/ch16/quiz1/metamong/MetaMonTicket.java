package ch16.quiz1.metamong;

import ch16.quiz1.framework.Ticket;

public class MetaMonTicket extends Ticket {
    private String name;

    public MetaMonTicket(String name) {
        this.name = name;
        System.out.println("[" + name + "]님의 메타몽 티켓을 발급합니다.");
    }

    @Override
    public void enter() {
        System.out.println(this.toString() + "님이 입장하셨습니다.");
    }

    @Override
    public String toString() {
        return "[MetaMonTicket:" + name + "]";
    }
}
