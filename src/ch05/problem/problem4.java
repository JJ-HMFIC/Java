package ch05.problem;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        while(true){
            System.out.println("----------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------");
            System.out.print("선택>");
            int n = sc.nextInt();
            if(n==1){
                System.out.print("예금액>");
                int m = sc.nextInt();
                amount += m;
            } else if (n==2) {
                System.out.print("예금액>");
                int m = sc.nextInt();
                amount -= m;
            } else if (n==3) {
                System.out.println(amount);
            } else {
                break;
            }
            System.out.println();

        }
        System.out.println("프로그램 종료");
    }
}
