package study0412;

interface A{
	public void method1();
}
class B implements A{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("B - method1()");
	}
}
class C implements A{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("C - method1()");
	}
	public void method2() {
		System.out.println("C - method2()");
	}
}
public class p391_8 {
	public static void action(A a) {
		C c=new C();
//		a.method1();
		if(a instanceof C) {
			c.method2();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(new B());
		action(new C());
	}

}
