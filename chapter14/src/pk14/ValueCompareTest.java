package pk14;

public class ValueCompareTest {

	public static void main(String[] args) {
		System.out.println("[-128~127 범위 외]"); //byte, int, short
		
		Integer obj1=300;
		Integer obj2=300;
		
		System.out.println(obj1==obj2); //객체 주소
		System.out.println("Unboxing -> "+(obj1.intValue() == obj2.intValue())); //내부 값 비교
		System.out.println("equals() -> "+(obj1.equals(obj2))); //내부 값 비교
		
		System.out.println("[-128~127 범위 내]"); //byte, int, short
		
		Integer obj3=30;
		Integer obj4=40;
		
		System.out.println(obj3==obj4); //객체 주소
		System.out.println("Unboxing -> "+(obj3.intValue() == obj4.intValue())); //내부 값 비교
		System.out.println("equals() -> "+(obj3.equals(obj4))); //내부 값 비교
	}
}
