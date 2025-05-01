package ch15.quiz;

import java.util.Arrays;

public class QuizBox<T extends Quiz> {
    private T[] list;
    private int size;
    public QuizBox() {
        this.size = 0;
        list = (T[]) new Quiz[5];
    }

    public void addQuiz(T quiz) {
        if (size == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[size++] = quiz;
    }

    public void printAll() {
        System.out.println("=== 퀴즈 박스 문제 목록 ===");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + list[i].getQuestion());
        }
    }
}
