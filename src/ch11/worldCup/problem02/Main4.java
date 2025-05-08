package ch11.worldCup.problem02;

import java.util.Scanner;

public class Main4 {


    public static void main(String[] args) throws InvalidNameException {
        // === 요즘 핫한 남자 연예인 10명 예시 ===
        MaleCelebrity[] maleCelebs = {
                new MaleCelebrity("박서준"),
                new MaleCelebrity("차은우"),
                new MaleCelebrity("정해인"),
                new MaleCelebrity("이도현"),
                new MaleCelebrity("송강"),
                new MaleCelebrity("김선호"),
                new MaleCelebrity("안효섭"),
                new MaleCelebrity("도경수"),
                new MaleCelebrity("임시완"),
                new MaleCelebrity("이준호")
        };

        // === 요즘 핫한 여자 연예인 10명 예시 ===
        FemaleCelebrity[] femaleCelebs = {
                new FemaleCelebrity("아이유"),
                new FemaleCelebrity("장원영"),
                new FemaleCelebrity("카리나"),
                new FemaleCelebrity("윈터"),
                new FemaleCelebrity("한소희"),
                new FemaleCelebrity("김세정"),
                new FemaleCelebrity("윤아"),
                new FemaleCelebrity("설현"),
                new FemaleCelebrity("제니"),
                new FemaleCelebrity("지수")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 이상형 월드컵 ===");
        System.out.println("1. 남자 연예인 월드컵");
        System.out.println("2. 여자 연예인 월드컵");
        System.out.print("경기를 선택하세요: ");
        String input = scanner.nextLine();

        int choice;
        try {
            choice = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요! (1 또는 2)");
            return;
        }

        if (choice == 1) {
            MaleMatchGame maleGame = new MaleMatchGame(maleCelebs);

            System.out.println("\n[셔플 전 참가자 명단]");
            maleGame.printCandidates();

            maleGame.shuffle();

            System.out.println("\n[셔플 후 참가자 명단]");
            maleGame.printCandidates();

        } else if (choice == 2) {
            FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);

            System.out.println("\n[셔플 전 참가자 명단]");
            femaleGame.printCandidates();

            femaleGame.shuffle();

            System.out.println("\n[셔플 후 참가자 명단]");
            femaleGame.printCandidates();

        } else {
            System.out.println("잘못된 선택입니다! 1 또는 2만 입력하세요.");
        }

    }
    class InvalidNameException extends Exception{
        private String message;
        public InvalidNameException(String message) {
            this.message = message;
        }
    }
}