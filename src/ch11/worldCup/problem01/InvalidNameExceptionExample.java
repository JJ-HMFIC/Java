package ch11.worldCup.problem01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InvalidNameExceptionExample {
    public static class InvalidNameException extends Exception{
        private String message;
        public InvalidNameException(String message) {
            this.message = message;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("참가자 이름을 입력하세요: ");
        try {
            String tmp = sc.nextLine();
            boolean result = Pattern.matches("^[가-힣]{2,10}$", tmp);
            if(!result) throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");
            System.out.println("(다음 단계로 진행합니다!)");
        } catch (InvalidNameException e) {
            System.out.println("😡 탈락! 잘못된 이름입니다: " + e.message);
        }
    }

}
