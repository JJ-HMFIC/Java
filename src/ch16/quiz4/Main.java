package ch16.quiz4;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 1. 앨범 생성
        PhotoAlbum album = new PhotoAlbum();

        // 2. 출력용 Consumer 정의
        Consumer<Photo> printer = photo -> System.out.println(photo);

        // 3. 사진 3장 생성 및 추가
        System.out.println("[📸 사진 촬영 중...]");

        album.addPhoto(new Photo("지우", "브이✌️"), printer);
        album.addPhoto(new Photo("이슬이", "하트❤️"), printer);
        album.addPhoto(new Photo("웅이", "메타몽 모자🎩"), printer);

        System.out.println("\n[📤 SNS에 업로드된 사진 목록]");

        // 4. 하트 포즈 필터 정의
        Predicate<Photo> heartFilter = p -> p.getPose().contains("하트");

        // 5. 필터링된 사진만 출력
        album.printFiltered(heartFilter, printer);
    }
}

