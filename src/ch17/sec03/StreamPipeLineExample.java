package ch17.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("a", 10),
                new Student("b", 20),
                new Student("c", 30)
        );
        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println(avg);

    }
}
