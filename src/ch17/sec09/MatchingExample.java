package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        boolean result = Arrays.stream(arr).allMatch(n -> n % 2 == 0);
        System.out.println("result = " + result );

        result = Arrays.stream(arr).anyMatch(n -> n % 3 == 0);
        System.out.println("result = " + result );

        result = Arrays.stream(arr).noneMatch(n -> n % 3 == 0);
        System.out.println("result = " + result );
    }
}
