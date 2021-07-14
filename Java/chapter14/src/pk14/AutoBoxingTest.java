package pk14;

public class AutoBoxingTest {

	public static void main(String[] args) {
		//Auto boxing
		Integer obj=100;
		
		System.out.println("value="+obj.intValue());
		
		//대입 시 Unboxing
		int value=obj;
		
		System.out.println("value="+value);
		
		//연산
		int result=obj+100;
		
		System.out.println("result="+result);
	}
}
