package stu.day0415;


//A 인터페이스 선언
interface A{
    //method1() 라는 추상메소드 선언
    public void method1();
}


//B 클래스 정의 , A 인터페이슬 구현 반드시 method1메소드를 구현해야함
class B implements A{
    @Override
    public void method1() {
        System.out.println("B - method1()");
    }
}

//C 클래스 정의 , A 인터페이슬 구현 반드시 method1메소드를 구현해야함
class C implements A{
    @Override
    public void method1() {
        System.out.println("C - method1()");
    }
    public void method2(){
        System.out.println("C - method2()");
    }
}
public class page390_8 {
    public static void action(A a){
        a.method1();

        //A 인터페이스를 구현한 객체를 매게변수로 받음
        //전달받은 객체의 method1을 호출한뒤, 해당 객체가 C클래스의 인스턴스인지 확인 후 인스턴스 메소드 method2를 호출
        if(a instanceof C){
            ((C) a).method2(); // 인스턴스 메소드 호출
        }
    }
    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
