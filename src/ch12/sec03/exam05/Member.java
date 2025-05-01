package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter ,equals, hashcode, tostring
@NoArgsConstructor //기본 생성자
@AllArgsConstructor // 모든 매개변수가 있는 생성자
public class Member {
    private String id;
    private String name;
    private int age;
}
