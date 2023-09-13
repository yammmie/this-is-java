package Chapter06;

// BankApplication의 Account와 클래스명 중복 - 임의 수정
class Account1 {
    // 작성 위치
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    private int balance;

    public void setBalance(int balance) {
        if(MIN_BALANCE <= balance && balance <= MAX_BALANCE)
            this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class AccountExample {
    public static void main(String[] args) {
        Account1 account = new Account1();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}
