package Chapter04;

public class Exercise04 {
    public static void main(String[] args) {
        // 작성 위치
        int num1 = 0, num2 = 0;

        do {
            num1 = (int)(Math.random() * 6) + 1;  // 1-6
            num2 = (int)(Math.random() * 6) + 1;  // 1-6

            System.out.println("(" + num1 + ", " + num2 + ")");
        } while(num1+num2 != 5);
    }
}
