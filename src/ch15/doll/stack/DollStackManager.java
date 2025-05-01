package ch15.doll.stack;

import java.util.Stack;

public class DollStackManager {
    public static final String[] dolls = {
            "피카츄", "리자몽", "꼬부기", "쿠로미", "헬로키티",
            "뽀로로", "짱구", "도라에몽", "스폰지밥", "미니언"
    };
    public Stack<String> stack = new Stack<>();

    public void storeRandomDoll() {
        String doll = dolls[(int) (Math.random() * dolls.length)];
        stack.push(doll);
        System.out.println("\uD83E\uDDF8 " + doll + "인형이 보관함에 추가되었습니다.");
    }

    public void showWaitingList() {
        if (stack.isEmpty()) {
            System.out.println("📭 보관함이 비어 있습니다.");
        } else {
            System.out.println("\uD83E\uDDF8 현재 보관 중인 인형:" + stack);
        }
    }

}
