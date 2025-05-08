package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamExample {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(System.out::println);
        System.out.println();

        int[] intArray = {1, 2, 3};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::println);
        System.out.println();
    }
}
