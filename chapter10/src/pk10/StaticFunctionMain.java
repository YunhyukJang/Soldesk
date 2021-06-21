package pk10;

public class StaticFunctionMain {

	public static void main(String[] args) {
		//일반적인 방법(객체 선언)
		StaticFunction sf=new StaticFunction();
		
		System.out.println(sf.str2);
		
		//static 메서드는 클래스명.메서드로 접근이 적합
		String str;
		
		str=StaticFunction.getStatic();
		
		System.out.println("str="+str);
	}
}
