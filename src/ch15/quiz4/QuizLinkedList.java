package ch15.quiz4;

import java.util.Iterator;
import java.util.function.Consumer;

public class QuizLinkedList implements Iterable<QuizNode> {

    QuizNode head;

    public QuizLinkedList() {
        head = null;
    }

    public void addLast(String title, String content) {
        QuizNode qz = new QuizNode(title, content);
        if(head ==null) head = qz; // 처음 노드 가리키기
        else {
            QuizNode temp = head;
            while(temp.next != null) temp = temp.next; // 헤드를 따라서 끝까지 가기
            temp.next = qz;
        }
    }
    void addFirst(String title, String content) {
        QuizNode qz = new QuizNode(title, content);
        qz.next = head;
        head = qz;
    }
    void removeFirst() {
        if(head == null) return;
        head = head.next;
    }

    void addAt(int index, String title, String content) {
        if(index == 0) addFirst(title, content);
        else {
            QuizNode temp = head;
            for(int i = 0; i < index-1; i++) temp = temp.next;
            QuizNode qz = new QuizNode(title, content);
            qz.next = temp.next;
            temp.next = qz;
        }
    }

    int size() {
        int count = 0;
        QuizNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }



    public void printAll() {
        System.out.println("=== 현재 도전할 문제 리스트 ===");
        QuizNode temp = head;
        while(temp != null) {
            System.out.println("문제 제목: "+ temp.title);
            System.out.println("문제 내용: "+ temp.content);
            System.out.println();
            temp = temp.next;
        }

    }

    @Override
    public Iterator<QuizNode> iterator() {
        return new QuizIterator(this);
    }

    @Override
    public void forEach(Consumer<? super QuizNode> action) {
        Iterable.super.forEach(action);
    }
}
