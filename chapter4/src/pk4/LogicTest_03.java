package pk4;

public class LogicTest_03 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		//and 연산은 앞이 거짓이면 무조건 거짓이므로 뒤는 연산 안함
		boolean value=((num1=num1+10)<10) && ((i=i+2)<10); //i=2, num1=20
		//boolean value=((i=i+2)<10) && ((num1=num1+10)<10); //i=4, num1=20
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//or 연산은 앞이 참이면 무조건 참이므로 뒤는 연산 안함
		boolean value1=((num1=num1+10)>10) || ((i=i+2)<10); //i=2, num1=30
		//boolean value1=(((i=i+2>10) || (num1=num1+10)>10); //i=4, num1=30
		
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
	}
}
