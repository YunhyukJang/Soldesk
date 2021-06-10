package pk4;

public class BitTest_01 {

	public static void main(String[] args) {
		//bit 연산
		int num1=5;
		int num2=10;
		
		//bit or
		int result=num1 | num2;
		
		System.out.println(result);
		
		//bit and
		result=num1 & num2;
		
		System.out.println(result);
		
		//bit xor
		result=num1 ^ num2;
		
		System.out.println(result);
		
		//bit not
		System.out.println(~num2+1);
	}
}
