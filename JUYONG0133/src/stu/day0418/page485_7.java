package stu.day0418;

class NotExistIDException extends Exception{                //extends Exception <-- 일반 예외로 선언
    public NotExistIDException(){}                          // 기본생성자
    public NotExistIDException(String message){             // 예외 메시지를 받는 생성자
        super(message);
    }
}
class WrongPasswordException extends Exception{             //extends Exception <-- 일반 예외로 선언
    public WrongPasswordException(){}                       // 기본 생성자
    public WrongPasswordException(String message){          // 예외 메시지를 받는 생성자
        super(message);
    }
}
public class page485_7 {
    public static void main(String[] args) {

    try{
        login("white","12345");
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    try{
        login("blue","1234");
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
        if(!id.equals("blue")){
            throw new NotExistIDException("아이디가 존재하지 않습니다.");       //예외 발생시 NotExistIDException 으로 떠넘김
        }
        if(!password.equals("12345")){
            throw new WrongPasswordException("비밀번호가 틀렸습니다");        //예외 발생시 WrongPasswrodException 으로 떠넘김
        }
    }
}
