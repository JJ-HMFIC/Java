package ch15.doll.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DollQueueManager {
    Queue<String> queue = new LinkedList<>();

    public void registerCustomer(String name) {
        queue.offer(name);
        System.out.println("\uD83D\uDC49 " + name + " 님이 대기열에 등록되었습니다.");
    }      // 고객 등록

    public void processNextCustomer() {
        String name = queue.peek();
        System.out.println("\uD83C\uDF89 " + name + " 님! 인형 뽑기 하러 오세요!");
    }// 첫 고객 뽑기 실행


    public String getNextCustomer() {
        if(queue.isEmpty()) return null;
        return queue.poll();
    }


    public void showWaitingList() {
        if (queue.isEmpty()) {
            System.out.println("📭 대기열이 비어 있습니다.");
        } else {
            System.out.println("🧾 현재 대기열: " + queue);
        }
    }                   // 현재 대기열 출력
}
