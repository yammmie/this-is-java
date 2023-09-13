package Chapter06;

class Printer {
    // 작성 위치
    /*void println(int value) {
        System.out.println(value);
    }

    void println(boolean value) {
        System.out.println(value);
    }

    void println(double value) {
        System.out.println(value);
    }

    void println(String value) {
        System.out.println(value);
    }*/

    static void println(int value) {
        System.out.println(value);
    }

    static void println(boolean value) {
        System.out.println(value);
    }

    static void println(double value) {
        System.out.println(value);
    }

    static void println(String value) {
        System.out.println(value);
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        /*Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");*/

        // 정적 메소드 호출 방식 - 객체 생성 X
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
