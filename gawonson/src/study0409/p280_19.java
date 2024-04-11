package study0409;

public class p280_19 {
	static final int MIN_BALANCE=0;
	final int Max_balance=1000000;

	private int balance;

	private p280_19() {
		balance=0;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=Max_balance )

			this.balance = balance;
		else 
			System.out.println("잔고가 설정값을 벗어났습니다.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p280_19 account=new p280_19();
		
		account.setBalance(10000);
		System.out.println("현재 잔고:"+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고:"+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고:"+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고:"+account.getBalance());
		
		
	}

}
