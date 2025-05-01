package ch06.problem;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    String read(String title) {
        System.out.print(title + ": ");
        String result = sc.nextLine();
        return result;
    }

    String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + ")" + ": ");
        String result = sc.nextLine();
        if (result.isEmpty()) {
            return defaultValue;
        }
        return result;
    }

    int readInt(String title) {
        System.out.print(title + ": ");
        String result = sc.nextLine();
        return Integer.parseInt(result);
    }

    boolean confirm(String title, boolean defaultValue) {
        String torf = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.print(title + torf + ": ");
        String result = sc.nextLine();
        if(result.isEmpty()) return defaultValue;

        if(result.equals("Y") || result.equals("y")) return true;

        else return false;
    }
    boolean confirm(String title) {
        return confirm(title, true);
    }

}
