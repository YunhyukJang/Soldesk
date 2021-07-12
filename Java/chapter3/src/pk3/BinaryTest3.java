package pk3;

public class BinaryTest3 {

	public static void main(String[] args) {
		int num1=0B00000000000000000000000000000101; //5
		int num2=0B11111111111111111111111111111010; //1의 보수
		int num3=0B11111111111111111111111111111011; //2의 보수
		int sum=num1+num3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(sum);
	}
}
