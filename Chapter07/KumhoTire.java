package Chapter07;

public class KumhoTire extends BasicTire {
    // 필드

    // 생성자
    public KumhoTire(String location, int maxlotation) {
        super(location, maxlotation);
    }

    // 메소드
    @Override public boolean roll() {
        ++accmulatedRotation;  // 누적 회전수 1 증가

        if(accmulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire 수명: " + (maxRotation-accmulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
}
