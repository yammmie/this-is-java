package Chapter06;

import java.util.Scanner;

class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while(run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if(selectNo == 5) {
                run = false;
            }
        }  // while

        System.out.println("프로그램 종료");
    }  // main

    // 계좌생성
    private static void createAccount() {
        // 작성 위치
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        // 이미 생성된 배열 accountArray에 객체를 추가하려면
        // 대입 연산자를 사용해야 함
        // 클래스[] = null로 초기화되기 때문에 null인지 비교
        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = new Account(ano, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌목록
    private static void accountList() {
        // 작성 위치
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");

        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i] == null)
                break;
            System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
        }
    }

    // 예금
    private static void deposit() {
        // findAccount() 호출해서 이용
        // 작성 위치
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("예금액: ");
        int balance = scanner.nextInt();

        Account account = findAccount(ano);

        if(account != null) {
            account.setBalance(account.getBalance() + balance);
            System.out.println("결과: 예금이 성공되었습니다.");
        }
    }

    // 출금
    private static void withdraw() {
        // findAccount() 호출해서 이용
        // 작성 위치
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("출금액: ");
        int balance = scanner.nextInt();

        Account account = findAccount(ano);

        if(account != null) {
            account.setBalance(account.getBalance() - balance);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    // Chapter06.Account 배열에서 ano와 동일한 Chapter06.Account 객체 찾기
    private static Account findAccount(String ano) {
        // 작성 위치
        Account account = null;

        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i] == null)
                break;
            if(accountArray[i].getAno().equals(ano))
                account = accountArray[i];
        }

        return account;
    }
}
