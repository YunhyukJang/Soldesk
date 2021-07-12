package pk13;

public class MyClassTest {

	public static void main(String[] args) {
		X x=new MyClass(); //자동 형 변환
		Y y=new MyClass(); //자동 형 변환
		MyInterface mi=new MyClass(); //자동 형 변환
		
		x.x();
		y.y();
		mi.myMethod();
	}
}
