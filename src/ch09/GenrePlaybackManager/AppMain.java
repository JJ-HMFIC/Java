package ch09.GenrePlaybackManager;

public class AppMain {
    public static void main(String[] args) {
        GenrePlaybackManager manager = new GenrePlaybackManager();

        // HIPHOP 전략
        manager.setPlayer(new GenrePlaybackManager.GenrePlayer() {
            @Override
            public void play(String title, String artist) {
                if (title.length() >= 8) {
                    System.out.print("\uD83D\uDCA5\uD83D\uDCA5\uD83D\uDCA5 ");
                } else System.out.print("\uD83D\uDCA5 ");
                System.out.println(title + " - " + artist + " (힙합 스타일)");
            }
            // TODO: 제목 길이가 8자 이상이면 💥💥💥, 아니면 💥 출력

        });
        manager.play("Drowning", "WOODZ");

        // BALLAD 전략
        manager.setPlayer(new GenrePlaybackManager.GenrePlayer() {
            @Override
            public void play(String title, String artist) {
                if (artist.contains(" ")) {
                    System.out.print("\uD83C\uDFB5\uD83C\uDFB5 ");
                } else System.out.print("\uD83C\uDFB5 ");
                System.out.println(title + " - " + artist + " (감성 발라드)");
            }
            // TODO: 아티스트 이름에 공백이 있으면 🎵🎵, 없으면 🎵 출력

        });
        manager.play("그녀가 웃잖아", "LUCY");

        // POP 전략
        manager.setPlayer(new GenrePlaybackManager.GenrePlayer() {
            @Override
            public void play(String title, String artist) {
                if ((title.length()+artist.length()) % 2 == 0) {
                    System.out.print("\uD83C\uDFA7\uD83C\uDFA7 ");
                } else System.out.print("\uD83C\uDFA7 ");
                System.out.println(title + " - " + artist + " (대중가요 스타일)");
            }
            // TODO: 제목 + 아티스트 글자 수가 짝수면 🎧🎧, 홀수면 🎧 출력
        });
        manager.play("오늘만 I LOVE YOU", "BOYNEXTDOOR");
    }
}
