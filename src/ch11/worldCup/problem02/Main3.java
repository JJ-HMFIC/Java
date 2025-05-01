package ch11.worldCup.problem02;

import java.util.Scanner;

public class Main3 {
    static class InvalidGenderException extends Exception {

        private String message;

        InvalidGenderException(String message) {
            this.message = message;
        }
    }


    public static void main(String[] args) throws InvalidGenderException {
        MaleCelebrity[] maleCelebs = {
                new MaleCelebrity("박서준"),
                new MaleCelebrity("차은우"),
                new MaleCelebrity("정해인")
        };

        FemaleCelebrity[] femaleCelebs = {
                new FemaleCelebrity("아이유"),
                new FemaleCelebrity("장원영")
        };

        MaleMatchGame maleGame = new MaleMatchGame(maleCelebs);
        FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);

        Scanner sc = new Scanner(System.in);
        System.out.println("=== 이상형 월드컵 ===");
        System.out.println("1. 남자 연예인 월드컵");
        System.out.println("2. 여자 연예인 월드컵");
        System.out.print("경기를 선택하세요: ");
        String cmd = sc.nextLine();
        try {
            int num;
            try {
                num = Integer.parseInt(cmd);
            } catch (NumberFormatException e) {
                throw new InvalidGenderException(">> 숫자만 입력하세요! (1 또는 2)");
            }
            if (num == 1) {
                maleGame.printCandidates();
            } else if (num == 2) {
                femaleGame.printCandidates();
            } else throw new InvalidGenderException(">> 잘못된 선택입니다! 1 또는 2만 입력하세요.");
        }catch (InvalidGenderException e) {
            System.out.println(e.message);
        }

    }
}
