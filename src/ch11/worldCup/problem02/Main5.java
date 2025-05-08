package ch11.worldCup.problem02;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) throws InvalidNameException {
        try {
            MaleCelebrity[] maleCelebs = new MaleCelebrity[11];
            String[] maleNames = {
                    "박서준", "차은우", "정해인", "이도현", "송강", "김선호",
                    "도경수", "임시완", "이준호", "안효섭", "유연석"
            };
            for (int i = 0; i < maleNames.length; i++) {
                if (!Pattern.matches("^[가-힣]{2,10}$", maleNames[i])) {
                    throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");
                }
                maleCelebs[i] = new MaleCelebrity(maleNames[i]);
            }

            FemaleCelebrity[] femaleCelebs = new FemaleCelebrity[11];
            String[] femaleNames = {
                    "아이유", "장원영", "카리나", "윈터", "한소희",
                    "김세정", "윤아", "설현", "제니", "지수", "안유진"
            };
            for (int i = 0; i < femaleNames.length; i++) {
                if (!Pattern.matches("^[가-힣]{2,10}$", femaleNames[i])) {
                    throw new InvalidNameException("이름은 한글 2~10자여야 합니다!");
                }
                femaleCelebs[i] = new FemaleCelebrity(femaleNames[i]);
            }

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
                maleGame.shuffle();
                System.out.println("\n[셔플된 남자 연예인 참가자 명단]");
                maleGame.printCandidates();
                maleGame.playGame();

            } else if (choice == 2) {
                FemaleMatchGame femaleGame = new FemaleMatchGame(femaleCelebs);
                femaleGame.shuffle();
                System.out.println("\n[셔플된 여자 연예인 참가자 명단]");
                femaleGame.printCandidates();
                femaleGame.playGame();

            } else {
                System.out.println("잘못된 선택입니다! 1 또는 2만 입력하세요.");
            }

        } catch (InvalidNameException e) {
            System.out.println(">> 이름 오류: " + e.getMessage());
        }
    }
   }