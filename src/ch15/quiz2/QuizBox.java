package ch15.quiz2;

import java.util.Arrays;

public class QuizBox<T extends Content> {
    private T[] list;
    private int size;

    public QuizBox() {
        this.size = 0;
        list = (T[]) new Quiz[5];
    }

    public void add(T quiz) {
        if (size == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[size++] = quiz;
    }

    boolean remove(Content content) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(content)) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[size - 1] = null; // 마지막 값 null로 정리
                size--;
                return true;
            }
        }
        return false;
    }

    static <T extends Content> void removeFromBox(QuizBox<? super T> box, T quiz) {
        box.remove(quiz);
        System.out.println("삭제 성공: " + quiz.getQuestion());
    }

    public void printAll() {
//        System.out.println("=== 퀴즈 박스 문제 목록 ===");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + list[i].getQuestion());
        }
    }
}
