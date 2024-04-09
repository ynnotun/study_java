package day0408;

public class ShopService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Singleton2 ob1=Singleton2.getInstance();
        Singleton2 ob2=Singleton2.getInstance();
        
        if(ob1==ob2) {
            System.out.println("같은 shopservice 객체 입니다.");
        }
        else{
            System.out.println("다른 shopservice 객체 입니다.");
        }
    }
}
