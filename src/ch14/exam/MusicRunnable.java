package ch14.exam;

public class MusicRunnable extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 제생합니다.");
            try {
                Thread.sleep(500);

            } catch (Exception e) {

            }
        }
    }
}
