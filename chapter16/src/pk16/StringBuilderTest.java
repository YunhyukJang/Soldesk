package pk16;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr=new String("Java");
		
		//처음 생성된 메모리의 주소
		System.out.println(System.identityHashCode(javaStr));
		
		//StringBuilder 생성
		StringBuilder buffer=new StringBuilder(javaStr);
		
		//연산 전 buffer 메모리의 주소
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and ");
		buffer.append("Android ");
		buffer.append("programming is fun!!");
		
		System.out.println(buffer);
		
		//연산 후 buffer 메모리의 주소
		System.out.println(System.identityHashCode(buffer));
		
		//새로 만들어진 javaStr 메모리의 주소
		javaStr=buffer.toString();
		
		System.out.println(System.identityHashCode(javaStr));
	}
}
