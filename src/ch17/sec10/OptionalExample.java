package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else System.out.println(0.0);

        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

        list.stream().mapToInt(Integer::intValue).average().ifPresent(a-> System.out.println(a));
    }
}
