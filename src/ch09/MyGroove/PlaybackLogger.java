package ch09.MyGroove;

public class PlaybackLogger {
    public void log(String title, String artist){
        class RecentLog {
            String title;
            String artist;

            public RecentLog(String title, String artist) {
                this.title = title;
                this.artist = artist;
            }
            void printLog() {
                String hot;
                if(title.length()>=10 || artist.length()>=10) hot = "(인기곡)";
                else hot = "";
                System.out.println("🎼 최근 재생: "+title+" - "+artist + hot);
            }
        }
        RecentLog recentLog = new RecentLog(title, artist);
        recentLog.printLog();
    }
}
