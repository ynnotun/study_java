package day0408;

public class ACCOUNT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
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
