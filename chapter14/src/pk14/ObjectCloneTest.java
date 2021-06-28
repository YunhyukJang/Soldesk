package pk14;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle=new Circle(10, 20, 30);
		
		Circle copyCircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		//hash 값
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
