package study0404;

import java.util.Scanner;

class BankApplication
{
	static Scanner sc = new Scanner(System.in);
	static Account20[] accountArray = new Account20[100];//생성만 함//초기화는 안됨

	public BankApplication() //생성자인데...뭘 생성해야할지 모르겠음..
	{
		;
	}

	public void menu()//기본 메뉴
	{
		int select;
		
		while(true)
		{
			printTitle();
			select = Integer.parseInt(sc.nextLine());
			if(select == 1)
			{
				makeAccount();//계좌생성
			}
			else if(select == 2)
			{
				listAccount();//계좌목록
			}
			else if(select == 3)
			{
				inputAccount();//예금
			}
			else if(select == 4)
			{
				ouputAccount();//출금
			}
			else if(select == 5)
			{
				break;//프로그램 종료
			}
			else
			{
				System.out.println("잘못 입력했습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	
	public void makeAccount()//계좌생성
	{
		System.out.println("-".repeat(10));
		System.out.println("계좌생성");
		System.out.println("-".repeat(10));
		
		String accountNumber;
		String owner;
		int balance;
		
		System.out.print("계좌번호 : ");
		accountNumber = sc.nextLine();
		System.out.print("계좌주 : ");
		owner = sc.nextLine();
		System.out.print("초기입금액 : ");
		balance = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < accountArray.length; i++)//accountArray 배열에 대해 반복하며
		{
			if(accountArray[i] == null)//아직 입력되지 않은 배열칸 발견시
			{
				Account20 account = new Account20(accountNumber, owner, balance); //Account20 객체 생성
				accountArray[i] = account;//배열칸에 저장 생성된 Account20 클래스객체 저장
				break;//반복문 탈출
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	public void listAccount()//목록출력
	{
		System.out.println("-".repeat(10));
		System.out.println("계좌목록");
		System.out.println("-".repeat(10));
		boolean find = false;
		
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] != null)//배열에 저장된 Account20 클래스 객체가 존재하면
			{
				printAccount(accountArray[i]);//배열에 저장된 Account20 클래스의 할당정보 출력
				find = true;//발견 참
			}
			else//배열에 Account20 클래스가 저장돼있지 않은 null이라면
			{
				break;//중단
			}
		}
		if(find == false)//계좌가 하나도 없으면 출력
		{
			System.out.println("계좌가 존재하지 않습니다.");
		}
	}
	
	public void printAccount(Account20 account)//Account20을 매개변수로 받아서 객체 정보 출력
	{
		//Account20 클래스의 변수는 private이므로 getter를 통해 받아야힘
		System.out.print(account.getAccountNumber() + "\t");
		System.out.print(account.getOwner() + "\t");
		System.out.println(account.getBalance());
	}
	
	public void inputAccount()//예금
	{
		System.out.println("-".repeat(10));
		System.out.println("예금");
		System.out.println("-".repeat(10));
		
		String accountNumber;
		int balance;
		boolean find = false;
		
		System.out.print("계좌번호 : ");
		accountNumber = sc.nextLine();
		System.out.print("예금액 : ");
		balance = Integer.parseInt(sc.nextLine());//문자형 받았을때 예외처리 필요
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] == null)//배열이 비어있는 null이라면 
			{
				break;//중단
			}
			else if(accountNumber.equals(accountArray[i].getAccountNumber()))// 배열에 저장된 Account20객체의 accountNumber가 찾는 accountNumber와 동일하다면
			{
				int temp = balance + accountArray[i].getBalance();
				accountArray[i].setBalance(temp);//새로 바뀐 balance 갱신
				System.out.println("결과 : 예금이 성공되었습니다.");
				find = true;//발견 참
				break;
			}
		}
		if(find == false)//계좌가 존재하지 않는다면
		{
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
	}
	
	public void ouputAccount()//출금
	{
		System.out.println("-".repeat(10));
		System.out.println("출금");
		System.out.println("-".repeat(10));
		
		String accountNumber;
		int balance;
		boolean find = false;
		
		System.out.print("계좌번호 : ");
		accountNumber = sc.nextLine();
		System.out.print("출금액 : ");
		balance = Integer.parseInt(sc.nextLine());//문자형 받았을때 예외처리 필요
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] == null)//배열이 비어있는 null이라면 
			{
				break;
			}
			else if(accountNumber.equals(accountArray[i].getAccountNumber()))// 배열에 저장된 Account20객체의 accountNumber가 찾는 accountNumber와 동일하다면
			{
				int temp = accountArray[i].getBalance() - balance;
				accountArray[i].setBalance(temp);//새로 바뀐 balance 갱신
				System.out.println("결과 : 출금이 성공되었습니다.");
				find = true;//발견 참
				break;
			}
		}
		if(find == false)//계좌가 존재하지 않는다면
		{
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
	}
	
	public void printTitle()//제목출력
	{
		System.out.println("-".repeat(50));
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-".repeat(50));
		System.out.print("선택 > ");
	}
}

class Account20
{
	private String accountNumber;//계좌번호
	private String owner;//계좌주
	private int balance;//예금
	
	Account20(String accountNumber, String owner, int balance)
	{
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	//getter
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	public String getOwner() 
	{
		return owner;
	}
	public int getBalance() 
	{
		return balance;
	}

	//setter
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public void setOwner(String owner) 
	{
		this.owner = owner;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
}

public class BookClass20 
{
	public static void main(String[] args) 
	{
		BankApplication bankapplication = new BankApplication();//Account20 클래스 배열을 관리할 BankApplication 클래스 생성
		bankapplication.menu();//관리 메뉴 메서드
	}
}
