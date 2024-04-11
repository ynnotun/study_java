package stu.day0407;

class Account{
    // MIN, MAX 값 0 과 1000000 상수선언
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    int balance; //계좌 잔액 확인을 위한 변수 선언

    //클래스 생성자
    Account(){
      this.balance = MIN_BALANCE; //초기 잔액을 최소값으로 설정
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>=MIN_BALANCE && balance <= MAX_BALANCE){  //입력받은 balance 값이 0보다 크고 1000000 보다 작다면0
            this.balance = balance;                         // balance 값을 입력받은 값으로 변경
        }

    }
}
public class page280_19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : "+account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : "+account.getBalance());
    }
}