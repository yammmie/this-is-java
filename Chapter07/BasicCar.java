package Chapter07;

// p.314 예제 - 원래 Car class
public class BasicCar {
    // 필드
    BasicTire frontLeftTire = new BasicTire("앞왼쪽", 6);
    BasicTire frontRightTire = new BasicTire("앞오른쪽", 2);
    BasicTire backLeftTire = new BasicTire("뒤왼쪽", 3);
    BasicTire backRightTire = new BasicTire("뒤오른쪽", 4);

    // 생성자

    // 메소드
    int run() {
        System.out.println("[자동차가 달립니다.]");

        if(frontLeftTire.roll() == false) {
            stop();
            return 1;  // 자동차 위치 리턴
        }

        if(frontRightTire.roll() == false) {
            stop();
            return 2;  // 자동차 위치 리턴
        }

        if(backLeftTire.roll() == false) {
            stop();
            return 3;  // 자동차 위치 리턴
        }

        if(backRightTire.roll() == false) {
            stop();
            return 4;  // 자동차 위치 리턴
        }

        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
