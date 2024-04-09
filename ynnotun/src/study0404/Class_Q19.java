package study0404;


class Account
{
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	public void setBalance(int balance) {
		if(MIN_BALANCE< balance && MAX_BALANCE > balance) 
			this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}


public class Class_Q19 {

	public static void main(String[] args)
	{
		Account account = new Account();
		
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
