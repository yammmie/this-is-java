package Chapter05;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        boolean run = true;  // while문 조건식
        int studentNum = 0;  // 학생 수
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성

        while(run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                // 작성 위치
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
            } else if(selectNo == 2) {
                // 작성 위치
                scores = new int[studentNum];

                for(int i=0; i<scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = scanner.nextInt();
                }
            } else if(selectNo == 3) {
                // 작성 위치
                for(int i=0; i<scores.length; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if(selectNo == 4) {
                // 작성 위치
                int max = 0, sum = 0;

                for(int i=0; i<scores.length; i++) {
                    if(max < scores[i]) {
                        max = scores[i];
                    }

                    sum += scores[i];
                }

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + (double) sum / scores.length);
            } else if(selectNo == 5) {
                run = false;  // while문 종료
            }
        }

        System.out.println("프로그램 종료");
    }
}
