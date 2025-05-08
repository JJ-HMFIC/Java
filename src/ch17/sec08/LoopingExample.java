package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};

        Arrays.stream(arr).filter(n -> n % 2 == 0).peek(System.out::println);
        int total = Arrays.stream(arr).filter(n -> n % 2 == 0).peek(System.out::println).sum();
        System.out.println("total = " + total);

        Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);


    }
}
