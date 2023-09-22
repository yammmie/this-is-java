package Chapter09;

public class Anonymous {
    // 필드의 초기값
    Vehicle field = new Vehicle() {
        @Override public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        // 로컬 변수의 초기값
        Vehicle localVar = new Vehicle() {
            @Override public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };

        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
