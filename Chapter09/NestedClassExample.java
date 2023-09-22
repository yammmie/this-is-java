package Chapter09;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // 인스턴스 멤버 클래스
        Car.Tire tire = myCar.new Tire();

        // 정적 멤버 클래스
        Car.Engine engine = new Car.Engine();
    }
}
