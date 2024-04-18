package study0418;

class NotExistIDException extends Exception//Exception클래스 상속받음
{
	public NotExistIDException() {}
	public NotExistIDException(String message) 
	{
		//빈칸 채우기
		super(message);//Exception클래스의 message인자 받는 생성자 호출
	}
}
class WrongPassWordException extends Exception//Exception클래스 상속받음
{
	public WrongPassWordException() {}
	public WrongPassWordException(String message)
	{
		//빈칸 채우기
		super(message);//Exception클래스의 message인자 받는 생성자 호출
	}
}

public class page485_7 // <- LoginExample
{
	public static void main(String[] args) 
	{
		try
		{
			login("white", "12345");//login 메서드 수행//아이디 예외 발생
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

		try 
		{
			login("blue", "54321");//login 메서드 수행 // 비밀번호 예외 발생
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPassWordException
	{
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue"))
		{
			 //빈칸 채우기
			throw new NotExistIDException("아이디가 존재하지 않습니다");//NotExistIDException 예외를 직접 발생
		}

		//password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if(!password.equals("12345"))
		{
			//빈칸 채우기
			throw new WrongPassWordException("패스워드가 일치하지 않습니다.");//WrongPassWordException 예외를 직접 발생
		}
	}
}
