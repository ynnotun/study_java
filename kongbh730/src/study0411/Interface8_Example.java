package study0411;
/*
 * 실행결과 
B - method1()
C - method1()
C - method2()
 */

interface A//인터페이스 A
{
	public void method1();
}

class B implements A//인터페이스 A를 상속받는 클래스 B
{
	@Override
	public void method1() 
	{
		System.out.println("B - method1()");
	}
}

class C implements A//인터페이스 A를 상속받는 클래스 C
{
	@Override
	public void method1() 
	{
		System.out.println("C - method1()");
	}

	public void method2()
	{
		System.out.println("C - method2()");
	}
}

public class Interface8_Example 
{
	public static void action(A a)//인자로 받은건 B, C지만 A로 형변환
	{
		a.method1();
		if(a instanceof C c)//빈칸 채우기
		{
			//instanceof 연산자
			/*
			 * a가 C c의 인스턴스인지?
			 */
			c.method2();
		}
	}
	
	public static void main(String[] args) 
	{
		action(new B());// 
		action(new C());
	}
}
