package pk11;

//라이브러리
public class C {
	
	public void method() {
		A a=new A();
		
		a.field="value";
		a.method();
	}

	public static void main(String[] args) {
		C c=new C();
		
		c.method();
	}
}
