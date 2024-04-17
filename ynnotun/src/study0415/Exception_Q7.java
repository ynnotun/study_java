package study0415;

/*
 * login() 메서드에서 존재하지 않는 ID를 입력하면
 * NotExistIDException을 발생시키고
 * 잘못된 패스워드를 입력하면 WrongPasswordException을 발생
 * 다음 Login Example의 실행 결과를 보고 빈칸 채우기  
 * 
 * */

class NotExistIDException extends Exception {
	public NotExistIDException() {
	
	}
	
	public NotExistIDException(String message) {
		System.out.println(message);
	}
}

class WrongPasswordException extends Exception {
	
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		System.out.println(message);

	}
}

public class Exception_Q7 {
	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
		// id가 blue가 아니라면 NotExistIDException
		
		if(!id.equals("blue")) {
			NotExistIDException e1 = new NotExistIDException("로그인 에러");
		}
		if(!password.equals("12345")) {
			WrongPasswordException e2 = new WrongPasswordException("비밀번호 에러");
		}
	}
}
