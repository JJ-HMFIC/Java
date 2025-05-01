package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        Thread thread2 = new MusicRunnable();
        thread1.start();
        thread2.start();
    }
}
