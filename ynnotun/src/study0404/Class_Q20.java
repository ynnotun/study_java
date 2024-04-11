package study0404;

import java.util.Scanner;

class Account20 {
	private String account;
	private String name;
	private int balance;

	// 생성자
	public Account20(String account, String name, int balance) {
		super();
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	// getters and setters
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class BankApplication {
	Account20[] accounts = new Account20[100];
	Scanner sc = new Scanner(System.in);
	
	// 타이틀 출력
	public void showTitle() {
		System.out.println("-".repeat(50));
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-".repeat(50));
		System.out.print("선택 > ");
	}
	
	// 선택한 메뉴 출력
	public void showSelect(int answer) {
		String[] arr = {"계좌생성","계좌목록","예금","출금","종료"};
		System.out.println("-".repeat(10));
		System.out.println(arr[answer-1]);
		System.out.println("-".repeat(10));
	}
	
	// 계좌 등록
	public void setAccountInfo(String account, String name, int balance) {
		for(int i = 0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = new Account20(account, name, balance);
				break;
			}
		}
	}
	
	// 계좌 목록 출력
	public void showAccountInfo() {
		for(int i = 0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accounts[i].getAccount(), accounts[i].getName(), accounts[i].getBalance());
			} else {
				break;
			}
		}
	}

	// 메뉴 선택
	public void selectMenu()
	{
		int select;
		
		Exit:
		while(true)
		{
			showTitle();
			select = Integer.parseInt(sc.nextLine());
			showSelect(select);
			switch(select) {
			case 1:
				System.out.print("계좌번호 :");
				String account = sc.nextLine();
				System.out.print("계좌주:");
				String name = sc.nextLine();
				try {
					System.out.print("초기입금액:");
					int balance = Integer.parseInt(sc.nextLine());
					setAccountInfo(account, name, balance);
					System.out.println("결과: 계좌가 생성되었습니다.");
					continue;
				} catch (NumberFormatException e) {
					System.out.println("올바른 값을 입력해주세요");
					continue;
				}
			case 2:
				showAccountInfo();
				continue;
			case 3:
				System.out.print("계좌번호 :");
				String account3 = sc.nextLine();
				
				try {
					System.out.print("예금액:");
					int balance = Integer.parseInt(sc.nextLine());
					boolean find = false;
					for(int i = 0; i<accounts.length; i++) {
						if(accounts[i].getAccount().equals(account3)) {
							accounts[i].setBalance(accounts[i].getBalance()+balance);
							find = true;
							break;
						}
					}
					if(!find) System.out.println("계좌가 존재하지 않습니다.");
					continue;
				} catch (NumberFormatException e) {
					System.out.println("올바른 값을 입력해주세요");
					continue;
				}
			case 4:
				System.out.print("계좌번호 :");
				String account4 = sc.nextLine();
				try {
					System.out.print("출금액:");
					int balance = Integer.parseInt(sc.nextLine());
					boolean find = false;
					for(int i = 0; i<accounts.length; i++) {
						if(accounts[i].getAccount().equals(account4)) {
							accounts[i].setBalance(accounts[i].getBalance()-balance);
							find = true;
							break;
						}
					}
					if(!find) System.out.println("계좌가 존재하지 않습니다.");
					continue;
				} catch (NumberFormatException e) {
					System.out.println("올바른 값을 입력해주세요");
					continue;
				}
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break Exit;
			default:
				System.out.println("잘못 선택");
				
			}
		}
		
	}
}

public class Class_Q20 {
	
	public static void main(String[] args) {
		BankApplication ba = new BankApplication();
		ba.selectMenu();
	
	}
}

