package pk19;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void showMyString(PrintString p) {
		p.showString("Hello lambda2");	
	}
	
	public static PrintString returnString() {
		return (s) -> System.out.println(s+" lambda3");
	}

	public static void main(String[] args) {
		//lambda
		PrintString lambdaStr=(s) -> System.out.println(s);
		
		lambdaStr.showString("Hello lambda1");
		
		//메서드 호출
		showMyString(lambdaStr);
		
		//lambda+method
		PrintString reStr=returnString();
		
		reStr.showString("Hello");
	}
}
