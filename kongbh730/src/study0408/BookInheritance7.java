package study0408;

class Parent
{
	public String nation;
	
	public Parent()//기본생성자
	{
		this("대한민국");//매개인자 생성자를 수행한다.
		System.out.println("Parent() call");
	}

	public Parent(String nation) //String 매개인자 생성자
	{
		this.nation = nation;//전달받은 nation이 자기 자신의 nation이 된다.
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent//Parent클래스를 상속받은 Child 클래스
{
	public String name;
	
	public Child()//기본 생성자
	{	
		this("홍길동");//매개인자 생성자를 수행한다.
		System.out.println("Child() call");
	}
	
	public Child(String name)//String 매개인자 생성자
	{
		this.name = name;//전달받은 name이 내 name이 된다.
		System.out.println("Child(String name) call");
	}
}

public class BookInheritance7
{
	public static void main(String[] args) 
	{
		Child child = new Child();//Parent클래스를 상속 받은 Child 클래스 기본생성자로 생성 생성
	}
}

/*
 * 출력결과
Parent(String nation) call
Parent() call
Child(String name) call
Child() call

1. Child 클래스를 기본생성자로 생성함
2. 매개인자가 없으므로 Child클래스의 기본 생성자로 생성
3. this("홍길동") 수행전에 Parent클래스 생성자 호출
4. Parent클래스의 기본생성자에서 this("대한민국")으로 인해 Parent의 매개변수 생성자 호출
5. Parent의 매개인자 생성자에서 Parent(String nation) call 출력 수행
6. Parent 기본생성자로 돌아와 Parent() call출력 수행
7. Child의 기본생성자의 this("홍길동") 수행
8. Child의 매개인자 생성자의 Child(String name) call출력 수행
9. Child의 기본생성자의 Child() call출력 수행
*/
