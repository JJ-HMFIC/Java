package ch09.GenrePlaybackManager;

public class GenrePlaybackManager {
    public interface GenrePlayer {
        void play(String title, String artist);
    }
    private GenrePlayer player;
    public void setPlayer(GenrePlayer player)  // 전략 주입
    {
        this.player = player;
    }

    public void play(String title, String artist)  // 전략에 따른 재생 실행
    {
        if (player != null) {
            player.play(title, artist);
        }
    }
}
