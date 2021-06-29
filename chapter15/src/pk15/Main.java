package pk15;

import pk15.A.C;

public class Main {

	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 클래스 객체 생성
		A.B b=a.new B();
		
		b.field1=3;
		b.method();
		
		//정적(static) 클래스 객체 생성
		A.C c=new A.C();
		
		c.field1=3;
		c.method();
		
		A.C.field2=3;
		A.C.method2();
		
		a.method();
	}
}
