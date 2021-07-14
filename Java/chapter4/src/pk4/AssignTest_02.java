package pk4;

public class AssignTest_02 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=2;
		
		num1 += num2; //num1=num1+num2
		
		System.out.println(num1); //30
		
		num1 -= num2;
		
		System.out.println(num1); //10
		
		num1 *= num3;
		
		System.out.println(num1); //20
		
		num1 /= num3;
		
		System.out.println(num1); //10
		
		num1 %= num3;
		
		System.out.println(num1); //0
	}
}
