package ch05.problem;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = null;
        int m = 0;
        int sum = 0;
        int max = 0;
        while(true){
            System.out.println("----------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 정수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------");
            System.out.print("선택>");
            int n = sc.nextInt();
            if(n==1){
                System.out.print("학생수>");
                m = sc.nextInt();
                scores = new int[m];
            } else if (n==2) {
                for (int i = 0; i <m ; i++) {
                    System.out.print("scores["+i+"]>");
                    int tmp = sc.nextInt();
                    scores[i] = tmp;
                    sum += tmp;
                    if(max<tmp) max = tmp;
                }
            } else if (n==3) {
                for (int i = 0; i <m ; i++) System.out.println("scores[" + i + "]>" + scores[i]);
            } else if (n==4) {
                double avg = (double) sum / m;
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+avg);
            }else {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println();

        }
    }
}
