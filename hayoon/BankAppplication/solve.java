package day0411;

import java.util.Scanner;

import day0325.Shop;

public class BankAppplication {
	public static void line() {
		System.out.println("-".repeat(60));
		System.out.println("1.계좌 생성\t2.계좌 목록\t3.예금\t4.출금\t5.종료");
		System.out.println("-".repeat(60));
	}
	public static void writeac(Account[] m) {
	    for (Account acc : m) {
	        if (acc != null) {
	            System.out.println(acc.getAc()+acc.getName()+acc.getMoney());
	        }
	    }
	}
	public static void addMoney(Account[] m, String ac_num1, int add_money) {
	    for (Account acc : m) {
	        if (acc != null && acc.getAc().equals(ac_num1)) {
	            int money = acc.getMoney() + add_money;
	            acc.setMoney(money);
	            System.out.println("예금이 성공적으로 처리되었습니다.");
	            return; // 원하는 계좌를 찾았으면 함수 종료
	        }
	    }
	    System.out.println("해당 계좌를 찾을 수 없습니다.");
	}

	public static void MinusMoney(Account[] m, String ac_num2, int minus_money) {
		// TODO Auto-generated method stub
		for (Account acc : m) {
	        if (acc != null && acc.getAc().equals(ac_num2)) {
	            int money = acc.getMoney()-minus_money;
	            acc.setMoney(money);
	            System.out.println("출금이 성공적으로 처리되었습니다.");
	            return; // 원하는 계좌를 찾았으면 함수 종료
	        }
	    }
	    System.out.println("해당 계좌를 찾을 수 없습니다.");
		
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account []account = new Account[100];
		int i=0;
		// TODO Auto-generated method stub
		loop:
		while(true) {
			line();
			
			int num;
			num=Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				System.out.println("-".repeat(20));
				System.out.println("계좌 생성");
				System.out.println("-".repeat(20));
				System.out.println("계좌 번호:");
				String ac_num=sc.nextLine();
				System.out.println("계좌주: ");
				String ac_name=sc.nextLine();
				System.out.println("초기 입금액:");
				int ac_money=Integer.parseInt(sc.nextLine());
				System.out.println("결과: 계좌가 생성 되었습니다.");
				account[i]=new Account(ac_num,ac_name,ac_money);
				i=i+1;
				break;
			case 2:
				System.out.println("-".repeat(20));
				System.out.println("계좌 목록");
				System.out.println("-".repeat(20));
				writeac(account);
				break;
			case 3:
				System.out.println("-".repeat(20));
				System.out.println("예금");
				System.out.println("-".repeat(20));
				System.out.println("계좌번호:");
				String ac_num1=sc.nextLine();
				System.out.println("예금액:");
				int add_money=sc.nextInt();
				sc.nextLine();
	
				addMoney(account,ac_num1,add_money);
				
				break;
			case 4:
				System.out.println("-".repeat(20));
				System.out.println("출금");
				System.out.println("-".repeat(20));
				System.out.println("계좌번호:");
				String ac_num2=sc.nextLine();
				System.out.println("예금액:");
				int minus_money=sc.nextInt();
				sc.nextLine();
	
				MinusMoney(account,ac_num2, minus_money);
				break;
			case 5:
				break loop;
			}
		
		}
	}
	
