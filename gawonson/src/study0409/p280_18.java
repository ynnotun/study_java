package study0409;

public class p280_18 {

	private static p280_18 ShopService=new p280_18();
	
	private p280_18() {
		
	}
	public static p280_18 getInstance() {
		return ShopService;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p280_18 obj1=ShopService.getInstance();
		p280_18 obj2= ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
