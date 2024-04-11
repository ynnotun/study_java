package study0404;

public class ShopService 
{
	//private 접근권한
	//static 필드
	//선언 + 초기화
	private static ShopService shopService = new ShopService();
	
	//private 생성자
	private ShopService()
	{
		;
	}
	
	//public 접근권한
	//static 메서드
	public static ShopService getInstance()
	{
		return shopService;
	}
}