package ch15.doll;

import ch15.doll.history.DollHistoryManager;
import ch15.doll.popularity.DollPopularityManager;
import ch15.doll.queue.DollQueueManager;
import ch15.doll.stack.DollStackManager;
import ch15.doll.util.RandomCustomerProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DollQueueManager queueManager = new DollQueueManager();
        DollStackManager stackManager = new DollStackManager();
        DollHistoryManager dollHistoryManager = new DollHistoryManager();
        DollPopularityManager popularityManager = new DollPopularityManager();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 유라의 인형뽑기 가게 ===\n" +
                    "[1] 고객 등록\n" +
                    "[2] 뽑기 진행 (보관 + 기록)\n" +
                    "[3] 현재 대기열 보기\n" +
                    "[4] 보관함 보기\n" +
                    "[5] 고객별 인형 기록 보기\n" +
                    "[6] 중복 제거된 인형 목록 보기\n" +
                    "[7] 인형별 인기 순위 보기\n" +
                    "[0] 종료");
            System.out.print("선택 >>");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("\uD83D\uDC4B 프로그램을 종료합니다.");
                break;
            } else if (num == 1) {
                queueManager.registerCustomer(RandomCustomerProvider.getRandomCustomer());
            } else if (num == 2) {
                queueManager.processNextCustomer(); // queue.peek
                stackManager.storeRandomDoll();     // 랜덤 인형 저장
                String next = queueManager.getNextCustomer(); // queue.poll

                if (next != null) {
                    String doll = stackManager.stack.peek(); // 뽑힌 인형 이름
                    dollHistoryManager.addHistory(next, doll);         // 고객별 기록
                    popularityManager.addDoll(doll);                   // 인형 인기 기록
                }

                System.out.print("👉 " + next + " 님 한 번 더 뽑으시겠습니까? (y/n)");
                sc.nextLine();
                if (sc.nextLine().equalsIgnoreCase("y")) {
                    queueManager.registerCustomer(next);
                    System.out.println("🔁 " + next + " 님이 다시 대기열에 등록되었습니다.");
                } else {
                    System.out.println("👋 프로그램을 종료합니다.");
                    break;
                }
            } else if (num == 3) {
                queueManager.showWaitingList();
            } else if (num == 4) {
                stackManager.showWaitingList();
            } else if (num == 5) {
                dollHistoryManager.showAllHistory();
            } else if (num == 6) {
                dollHistoryManager.showAllUniqueHistory();
            } else if (num == 7) {
                popularityManager.showRanking();
            }
        }
    }
}
