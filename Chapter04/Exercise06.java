package Chapter04;

public class Exercise06 {
    public static void main(String[] args) {
        // 작성 위치
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
