package ch09.wholeClass;

public class MusicApp {
    private final String user = "yura";

    public static class PlayerUI {
        MusicApp tmp = new MusicApp();
        public void show() {
            System.out.println("🎧 현재 사용자: " + tmp.user); // ❌ 컴파일 에러 발생
        }
    }

    public static void main(String[] args) {
        MusicApp.PlayerUI ui = new MusicApp.PlayerUI();
        ui.show();
    }
}