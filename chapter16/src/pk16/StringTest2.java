package pk16;

public class StringTest2 {
	
	public static void main(String[] args) {
		String javaStr=new String("java");
		String androidStr=new String("Android");
		
		System.out.println(javaStr); //String 클래스는 기본 toString 처리되어있다.
		System.out.println(javaStr.hashCode());
		System.out.println(System.identityHashCode(javaStr));
		
		System.out.println("--------------------");
		
		javaStr=javaStr.concat(androidStr); //concat()=문자열을 붙혀준다.
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
	}
}
