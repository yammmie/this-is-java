package Chapter04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;  // while문 조건식
        int balance = 0;  // 잔고

        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            // 작성 위치
            int num = scanner.nextInt();

            switch(num) {
                case 1:
                    System.out.print("예금액> ");
                    balance += scanner.nextInt();

                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= scanner.nextInt();

                    break;
                case 3:
                    System.out.println("잔고> " + balance);

                    break;
                case 4:
                    run = false;  // while문 종료
            }

            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
