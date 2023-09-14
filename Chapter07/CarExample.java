package Chapter07;

public class CarExample {
    public static void main(String[] args) {
        BasicCar myCar = new BasicCar();

        for(int i=1; i<=5; i++) {
            int problemLocation = myCar.run();

            switch(problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    myCar.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    myCar.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    myCar.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    myCar.backRightTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }

            System.out.println("----------------------------");  // 1회전시 출력되는 내용 구분
        }
    }
}
