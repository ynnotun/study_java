package study0404;

class Account
{
	final int MIN_BALANCE = 0; //상수로 최소 잔고값 0 선언
	final int MAX_BALANCE = 1000000;//상수로 최대 잔고값 1000000 선언
	private int balance;
	
	Account()//클래스 기본 생성자
	{
		balance = 0;//잔고는 0으로 초기화
	}
	
	//getter
	int getBalance()
	{
		return balance;
	}
	
	//setter
	void setBalance(int balance)
	{
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)//0 <= 잔고 <= 1000000
		{
			this.balance = balance;//잔고 최신화
		}
		else
		{
			;
		}
	}
}

public class BookClass19
{
	public static void main(String[] args)
	{
		Account account = new Account();//Account 클래스를 account라는 이름으로 생성
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance()); // 현재 잔고 10000
	
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance()); // 현재 잔고 10000
	
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance()); // 현재 잔고 10000
	
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance()); // 현재 잔고 300000
	}
}
