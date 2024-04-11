package study0408;

class Tire
{
	public void run()
	{
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire
{
	@Override
	public void run() //오버라이딩된 run() 
	//같은 이름의 메소드가 자식클래스에서 오버라이딩 된다면, 
	//부모 메소드 말고 자식메소드를 호출한다.
	{
		//super.run();//생략가능
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}

public class BookInheritance8 
{
	public static void main(String[] args) 
	{
		SnowTire snowTire = new SnowTire();//Tire클래스로부터 상속받은 SnowTire 클래스 생성
		Tire tire = snowTire;//Tire 클래스인 tire를 snowTire로 선언, 형변환
		
		snowTire.run(); //SnowTire클래스의 run()을 실행
		tire.run();//SnowTire클래스의 run()을 실행
	}
}

/*
 * 출력 결과
스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.

 */
