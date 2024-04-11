package study0408;

class Parent{
	public String nation;
	
	public Parent() {
		this("대한민국"); // 3. 같은 클래스 내부의 String 인자를 가진 생성자 호출
		System.out.println("Parent() call"); // 6. 위의 명령 실행이 끝났으므로 출력 후 Child 생성자로 이동 
	}
	public Parent(String nation) {
		this.nation=nation; // 4. 클래스 내부 변수에 값을 입력
//		System.out.println(nation); // 이 명령어가 실행되면 "대한민국"을 출력한다
		System.out.println("Parent(String nation) call"); // 5. 출력 후 원래 생성자로 돌아감
	}
}

class Child extends Parent{
	public String name;
	
	public Child() {
		// 2. 부모 먼저 호출
		this("홍길동"); // 7. 같은 클래스 내부의 String 인자를 가진 생성자 호출
		System.out.println("Child() call"); // 10. 위의 명령 실행이 끝났으므로 출력
	}
	public Child(String name) {
		this.name=name; // 8. name 변수에 "홍길동" 저장
		System.out.println("Child(String name) call"); // 9. 출력 후 원래 생성자로 돌아감 
	}
}

public class Inheritance_Q7 {
	public static void main(String[] args) {
		Child child=new Child(); // 1. 객체 생성
	}

}
