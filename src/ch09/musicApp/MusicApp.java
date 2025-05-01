package ch09.musicApp;

public class MusicApp {
    private String title;
    private String artist;
    private String genre;

    public MusicApp(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    class MusicPlayer {
        //        private String emoji;
        public String getGenre(String genre) {
            if (MusicApp.this.genre.equals("HIPHOP")) {
                return "\uD83D\uDCA5";
            } else if (MusicApp.this.genre.equals("BALLAD")) {
                return "\uD83C\uDFA7";
            } else return "\uD83C\uDFB5";
        }

        public void play() {
            System.out.println(getGenre(MusicApp.this.genre)
                    + " " + MusicApp.this.title + " - "
                    + MusicApp.this.artist + " 을(를) 재생합니다. "
                    + getGenre(MusicApp.this.genre));
        }
    }
}
