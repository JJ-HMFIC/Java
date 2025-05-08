package ch17.sec02;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        list.parallelStream().forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });

    }
}
