package ch15.quiz5;

import java.util.Iterator;

public class QuizLinkedList  implements Iterable<QuizNode>{

    QuizNode head;


    void addLast(String title, String answer) {
        QuizNode node = new QuizNode(title, answer);
        if (head == null) {
            head = node;
        } else {
            QuizNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    int size() {
        int count = 0;
        QuizNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public Iterator<QuizNode> iterator() {
        return new QuizIterator(this);
    }
}
