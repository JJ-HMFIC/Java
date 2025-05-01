package ch15.quiz3;

public class QuizNode {
    String title;
    String content;
    QuizNode next;

    public QuizNode(String title, String content) {
        this.title = title;
        this.content = content;
        this.next = null;
    }
}
