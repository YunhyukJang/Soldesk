package pk7;

public class FunTest02 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int sum=addNum(num1, num2); //메서드 호출
		
		System.out.println(num1+"+"+num2+"="+sum);
	}
	
	//void가 없을 시 반드시 return이 필요
	public static int addNum(int n1, int n2) {
		int result=n1+n2;
		
		return result;
	}
}
