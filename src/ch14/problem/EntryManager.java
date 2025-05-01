package ch14.problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EntryManager {
    private Stack<Fan> vipStack = new Stack<>();
    private Queue<Fan> normalQueue = new LinkedList<>();
    private int ticketCount;

    public EntryManager(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    void registerFan(Fan fan) {
        if (fan.isVIP()) {
            vipStack.push(fan);
        } else {
            normalQueue.add(fan);
        }
    }

    synchronized boolean processEntry(Fan fan) {
        if (fan.isVIP()) {
            if (vipStack.peek().getName().equals(fan.getName())) {
                vipStack.pop();
                ticketCount--;
                System.out.println("VIP "+fan.getName()+" 입장 완료!");
                return true;
            }
        }else{
            if(normalQueue.peek().getName().equals(fan.getName())){
                normalQueue.poll();
                ticketCount--;
                System.out.println(fan.getName()+" 입장 완료!");
                return true;
            }
        }
        return false;
    }


}
