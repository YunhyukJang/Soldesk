package pk11;

public class ChildMain {

	public static void main(String[] args) {
		Child child=new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent=new Parent();
		
		parent.method1();
		parent.method2();
	}
}
