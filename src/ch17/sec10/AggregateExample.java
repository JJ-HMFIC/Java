package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        long count = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("count = " + count);

        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sum = " + sum);

        double avg = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        int asInt = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("asInt = " + asInt);

        int asInt1 = Arrays.stream(numbers).filter(n -> n % 3 == 0).findFirst().getAsInt();
        System.out.println("asInt1 = " + asInt1);
    }
}
