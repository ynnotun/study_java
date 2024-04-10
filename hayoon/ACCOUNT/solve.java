package day0408;

public class Account{
	
	static int MIN_BALANCE=0;
	static int MAX_BALANCE=1000000;
	private int Balance;
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int Balance) {
		if(MIN_BALANCE<=Balance && Balance<=MAX_BALANCE) {
			this.Balance=Balance;
		}
		
	}
	
}

