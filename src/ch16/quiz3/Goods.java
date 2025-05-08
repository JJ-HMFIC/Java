package ch16.quiz3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Goods {
    private String name;
    private String color;
    private boolean useful;

    // 생성자, getter 3개

    @Override
    public String toString() {
        return this.name + " (" + this.color + ")";
    }
}