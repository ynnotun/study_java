package stu.day0407;

import java.util.Scanner;

//클래스 선언 19번 문제도 같은 Account를 사용해서 Account1로 생성
// 이 클래스는 은행 계좌
class Account1{
    //계좌번호,계좌주, 잔액 저장하는 변수선언
    private String aNum;
    private String aName;
    private int balance;

    //Account 생성자
    public Account1(String aNum, String aName, int balance){
        this.aNum = aNum;
        this.aName = aName;
        this.balance = balance;
    }

    //setter & getter 메소드 호출선언
    public String getaNum() {
        return aNum;
    }

    public void setaNum(String aNum) {
        this.aNum = aNum;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금하는 메소드
    public void mIn(int money){
        balance += money;
        System.out.println(money+" 원 입금.\n현재 잔액 : "+balance+" 원");
    }
    //출금하는 메소드
    public void mOut(int money){
        if(balance > money){  //현재 잔액이 출금액보다 작으면 출금할수없기때문에 출금액이 더 작을때만 출금
            balance -= money;
            System.out.println(money+" 원 입금.\n현재 잔액 : "+balance+" 원");
        }
        else {
            System.out.println("잔액 부족,");
        }
    }
}
//계좌 100개 저장하기위한 메소드
class BankApplication{

    //100개의 계좌 생성을 위한 변수와 생성된 계좌의 개수를 세기위한 변수생성
    private Account1[] accounts;
    private int num;

    public BankApplication() {
        accounts = new Account1[100]; //100칸 길이 설정
        num = 0;
    }

    public void addAccount(Account1 account) {
        if (num < 100) { //if문을 통해 100개가 넘어가면 계좌생성을 할수 없도록한다.
            boolean same = false;  //boolean형 변수를 선언 이후 중복되어있는 계좌를 찾을때 사용
            for (int i = 0; i < num; i++) {
                if (accounts[i].getaNum().equals(account.getaNum())) {      //입력받은 계좌와 중복된 계좌가 있는지 확인
                    System.out.println("이미 등록되어 있는 계좌입니다. 다른 계좌번호를 입력해주세요");
                    same = true;
                    break;
                }

            }

            if (!same) {
                accounts[num] = account;
                num++;
                System.out.println("계좌가 생성되었습니다.");
            } else {
                System.out.println("더이상계좌를생성할수없습니다.");
            }
        }
    }
    public void writeAccount(){     // 입력받은 계좌정보를 출력하기 위함
        for(int i = 0; i < num; i++){
            System.out.println(accounts[i].getaNum()+" "+accounts[i].getaName()+" "+accounts[i].getBalance());
        }
    }
    public Account1 findAccount(String depo){  //입력받은 계좌번호와 일치하는 계좌를 찾기 위함 (입출금하기위함)
        for(int i = 0;  i < num; i++){
            if(accounts[i].getaNum().equals(depo)){
                return accounts[i]; //입력받은 계좌와 일치하는 계좌가 있다면 해당 계좌를 반환
            }
        }
        return null;
    }
}
public class page281_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankApplication backA = new BankApplication();
        int num = 0;


        while (true){
            System.out.println("-".repeat(50));
            System.out.println("1.계좌 생성\t 2.계좌목록\t 3.예금\t 4.출금\t 5.종료");
            System.out.println("-".repeat(50));
            System.out.print("선택 > ");

                num = Integer.parseInt(sc.nextLine());



            if(num == 5 ){
                System.out.println("프로그램 종료");
                break;
            }
            else if(num == 1){
                System.out.println("==========");
                System.out.println("계좌생성");
                System.out.println("==========");
                System.out.print("계좌 번호 : ");
                String acNum = sc.nextLine();
                System.out.print("계좌주 : ");
                String acName = sc.nextLine();
                System.out.print("초기입금액 : ");
                int acbalance = Integer.parseInt(sc.nextLine());
                Account1 newAccount = new Account1(acNum, acName, acbalance);
                backA.addAccount(newAccount);

            }
            else if(num == 2){
                System.out.println("==========");
                System.out.println("계좌 목록");
                System.out.println("==========");
                backA.writeAccount();

            }
            else if(num == 3){
                System.out.println("==========");
                System.out.println("예금");
                System.out.println("==========");
                System.out.print("계좌 번호 : ");
                String depo = sc.nextLine();
                Account1 deopAccount = backA.findAccount(depo);
                if(deopAccount != null){
                    System.out.print("예금액 : ");
                    int plus = Integer.parseInt(sc.nextLine());
                    deopAccount.mIn(plus);
                }
                else {
                    System.out.println("해당 계좌가 없음");
                }

            }
            else if(num == 4){
                System.out.println("==========");
                System.out.println("출금");
                System.out.println("==========");
                System.out.print("계좌 번호 : ");
                String depo = sc.nextLine();
                Account1 deopAccount = backA.findAccount(depo);
                if(deopAccount != null){
                    System.out.println("출금액 : ");
                    int minus = Integer.parseInt(sc.nextLine());
                    deopAccount.mOut(minus);
                }
                else {
                    System.out.println("해당 계좌가 없음");
                }

            }

        }
    }
}
