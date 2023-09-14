package Chapter07;

// p.314 예제 - 원래 Car class
public class BasicCar {
    // 필드
    // 개선 전
    /*BasicTire frontLeftTire = new BasicTire("앞왼쪽", 6);
    BasicTire frontRightTire = new BasicTire("앞오른쪽", 2);
    BasicTire backLeftTire = new BasicTire("뒤왼쪽", 3);
    BasicTire backRightTire = new BasicTire("뒤오른쪽", 4);*/

    // 배열로 개선 후
    BasicTire[] tires = {
        new BasicTire("앞왼쪽", 6),
        new BasicTire("앞오른쪽", 2),
        new BasicTire("뒤왼쪽", 3),
        new BasicTire("뒤오른쪽", 4)
    };

    // 생성자

    // 메소드
    int run() {
        System.out.println("[자동차가 달립니다.]");

        // 개선 전
        /*if(frontLeftTire.roll() == false) {
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
        }*/

        // 배열로 개선 후
        for(int i=0; i<tires.length; i++) {
            if(!tires[i].roll()) {
                stop();
                return i+1;
            }
        }

        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
