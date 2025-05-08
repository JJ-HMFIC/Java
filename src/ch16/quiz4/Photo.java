package ch16.quiz4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Photo {
    private String name; // 촬영자 이름
    private String pose; // 포즈

    @Override
    public String toString() {
        return this.getName() + "님이 \'" + this.getPose() + "\'포즈로 사진을 찍었습니다.";
    }
}
