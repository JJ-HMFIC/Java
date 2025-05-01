package ch15.quiz5;

public class QuizNode {
    String title;
    String answer;
    QuizNode next;

    public QuizNode(String title, String content) {
        this.title = title;
        this.answer = content;
        this.next = null;
    }
}
