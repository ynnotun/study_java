package study0404;

public class Class_Q18 {
	public static void main(String[] args) 
	{
		/*
		 * 싱글톤 패턴
		 * 객체 지향 프로그래밍에서 특정 클래스가 단 하나만의 인스턴스를 생성하여 사용하기 위한 패턴
		 * 생성자를 여러 번 호출하더라도 인스턴스가 하나만 존재하도록 보장
		 * 애플리케이션에서 동일한 객체 인스턴스에 접근할 수 있도록 함
		 * 
		 * 싱글톤 패턴을 사용하는 이유
		 * 인스턴스를 여러 개 만들게 되면 불필요한 자원을 사용하게 되고, 프로그램이 예상치 못한 결과를 낳을 수 있음 
		 * 객체를 단 한 번만 생성하여 전역에서 이를 공유하고 사용할 수 있게 하기 위해 싱글톤 패턴을 사용
		 * 출처: https://ittrue.tistory.com/563 [IT is True:티스토리]
		 */
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) System.out.println("같은 ShopService 객체입니다.");
		else System.out.println("다른 ShopService 객체입니다.");
	}
}
