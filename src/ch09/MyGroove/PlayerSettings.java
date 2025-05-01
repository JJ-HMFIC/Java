package ch09.MyGroove;

public class PlayerSettings {
    public static class Mode {
        static boolean shuffle = false;
        static boolean repeat = true;
        static int volumeLevel = 5;


        public static void printSettings() {
            System.out.println();
            System.out.println("\uD83C\uDF9B 현재 재생 설정 상태");
            System.out.println("Shuffle = " + ((shuffle) ? "ON" : "OFF"));
            System.out.println("Repeat = " + ((repeat) ? "ON" : "OFF"));
            System.out.println("volume = " + volumeLevel);
            System.out.println();
        }

        public static void setShuffle(boolean value) {
            shuffle = value;
            String tmp = (shuffle) ? "ON" : "OFF";
//            System.out.print("Shuffle 모드가 ");
//            System.out.println(tmp + "으로 설정되었습니다.");

        }

        public static void setRepeat(boolean value) {
            repeat = value;
            String tmp = (repeat) ? "ON" : "OFF";
//            System.out.print("Repeat 모드가 ");
//            System.out.println(tmp + "으로 설정되었습니다.");

        }

        public static void setVolumeLevel(int level) {
            if (level < 0 || level > 10) {
                System.out.println("볼륨은 0~10 사이로 설정해야 합니다.");

            } else {
                volumeLevel = level;
                System.out.println("볼륨이 " + volumeLevel + "로 설정되었습니다.");

            }
        }

    }
}
