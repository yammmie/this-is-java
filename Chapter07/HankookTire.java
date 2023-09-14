package Chapter07;

public class HankookTire extends BasicTire {
    // 필드

    // 생성자
    public HankookTire(String location, int maxlotation) {
        super(location, maxlotation);
    }

    // 메소드
    @Override public boolean roll() {
        ++accmulatedRotation;  // 누적 회전수 1 증가

        if(accmulatedRotation < maxRotation) {
            System.out.println(location + "HankookTire 수명: " + (maxRotation-accmulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
