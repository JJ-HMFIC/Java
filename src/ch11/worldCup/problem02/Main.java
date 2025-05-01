package ch11.worldCup.problem02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static int count;

    static class InvalidNameException extends Exception {
        private String message;

        public InvalidNameException(String message) {
            this.message = message;
        }
    }

    public static void settings(int num, Celebrity[] arr, String gender) {
        Scanner sc = new Scanner(System.in);
        while (num > count) {
            try {
                System.out.print("이름 입력: ");
                String tmp = sc.nextLine();

                boolean result = Pattern.matches("^[가-힣]{2,10}$", tmp);
                if (!result) throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");

                Celebrity celebrity;
                if (gender.equals("male")) {
                    celebrity = new MaleCelebrity(tmp);
                } else {
                    celebrity = new FemaleCelebrity(tmp);
                }
                boolean check = false;

                for (int i = 0; i < count; i++) {
                    if (arr[i].equals(celebrity)) {
                        check = true;
                        break;
                    }
                }

                if (check) {
                    System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                } else {
                    arr[count] = celebrity;
                    count++;
                }

            } catch (InvalidNameException e) {
                System.out.println(e.message);
            }
        }
    }

    public static void main(String[] args) throws InvalidNameException {
        Scanner sc = new Scanner(System.in);
        System.out.print("남자 연예인 몇 명 등록할까요? ");
        int num = sc.nextInt();
        sc.nextLine();

        Celebrity[] maleCeleb = new MaleCelebrity[num];
        count = 0;
        settings(num, maleCeleb, "male");

        System.out.print("여자 연예인 몇 명 등록할까요? ");
        num = sc.nextInt();
        sc.nextLine();
        Celebrity[] femaleCeleb = new FemaleCelebrity[num];
        count = 0;
        settings(num, femaleCeleb, "female");

        System.out.println();

        System.out.println("[남자 연예인 리스트]");
        for (Celebrity celeb : maleCeleb) {
            System.out.println("남자 연예인: " + celeb.getName());
        }
        System.out.println();

        System.out.println("[여자 연예인 리스트]");
        for (Celebrity celeb : femaleCeleb) {
            System.out.println("여자 연예인: " + celeb.getName());
        }

    }
}
