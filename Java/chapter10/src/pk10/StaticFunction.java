package pk10;

public class StaticFunction {
	String str1="일반 멤버 변수";
	static String str2="Static 멤버 변수";
	
	public static String getStatic() {
		//return str1; *static 내부에서는 static 변수만 접근 가능
		return str2;
	}
}
