package Chapter07;

// p.314 예제 - 원래 Tire class
public class BasicTire {
    // 필드
    public int maxRotation;  // 최대 회전수 (타이어 수명)
    public int accmulatedRotation;  // 누적 회전수
    public String location;  // 타이어의 위치

    // 생성자
    public BasicTire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll() {
        ++accmulatedRotation;  // 누적 회전수 1 증가

        if(accmulatedRotation < maxRotation) {
            System.out.println(location + "Tire 수명: " + (maxRotation-accmulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
