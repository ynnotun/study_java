package study0408;

class Tire{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다."); // 5, 9. 출력 후 자식 클래스로 이동
	}

}

class SnowTire extends Tire{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run(); // 4, 8. 부모 클래스의 run 메서드 실행
		System.out.println("스노우 타이어가 굴러갑니다."); // 6, 10. 출력 후 다음 명령어 실행
	}
	
//	public void stop() {
//		System.out.println("스노우 타이어가 멈췄습니다.");
//	}	
}

public class Inheritance_Q8 {
	public static void main(String[] args) {
		SnowTire snowTire=new SnowTire(); // 1. SnowTire 객체 생성
		Tire tire=snowTire; // 2. Tire 변수에 SnowTire 객체
		
		snowTire.run(); // 3. SnowTire의 run 메서드 실행
		tire.run(); // 7. SnowTire의 run 메서드 실행
		
//		tire.stop();
		// 만일 SnowTire에서 오버라이드 하고 있지 않은 메서드를 호출하는 경우 오류를 발생한다
		
		// 11. 더이상 명령어가 없으므로 실행 종료
	}
}
