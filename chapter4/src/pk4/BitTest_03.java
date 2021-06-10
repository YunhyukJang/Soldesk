package pk4;

public class BitTest_03 {

	public static void main(String[] args) {
		int num=0B00000101; //5
		
		System.out.println(num);
		
		//20이 되도록 왼쪽 쉬프트 연산
		System.out.println(num << 2);
		
		//1이 되도록 오른쪽 쉬프트 연산
		int result=num >> 2;
		
		System.out.println(result);
	}
}
