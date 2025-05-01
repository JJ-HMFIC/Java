package ch15.quiz5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class QuizIterator implements Iterator<QuizNode> {
    private QuizLinkedList quizLinkedList;
    private int index;

    public QuizIterator(QuizLinkedList quizLinkedList) {
        this.quizLinkedList = quizLinkedList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < quizLinkedList.size()) {
            return true;
        } else return false;
    }

    @Override
    public QuizNode next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        QuizNode pq = quizLinkedList.head;
        for(int i = 0; i < index; i++) pq = pq.next;
        index++;

        return pq;
    }
}
