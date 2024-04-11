package study0404;

public class BookClass18 
{
	public static void main(String[] args) 
	{
		/*
		 * 싱글톤 패턴
		 * 애플리케이션 전체에서 단 한개의 객체만 생성하고 싶을 경우 사용
		 * 생성자를 private로 접근제한해서 외부에서 생성자 호출을 막음
		 * 대신 getInstance와 같은 메서드를 통해 객체 획득 가능
		 */
		ShopService obj1 = ShopService.getInstance();//이름이 obj1이지만 ShopService라는 객체 하나임
		ShopService obj2 = ShopService.getInstance();//이름이 obj2이지만 ShopService라는 객체 하나임
		
		if(obj1 == obj2)//이름은 달라도 생성된 객체는 ShopService 단 하나임
		{
			System.out.println("같은 ShopService 객체입니다.");
		}
		else
		{
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
