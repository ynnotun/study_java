package day0411;

public class Account {
	private String ac;
	private String name;
	private int money;
	

	
	
	public Account(String ac, String name, int money) {
		super();
		this.ac=ac;
		this.name=name;
		this.money=money;
		
	}
	
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
