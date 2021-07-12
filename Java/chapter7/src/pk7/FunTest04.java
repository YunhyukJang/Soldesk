package pk7;

public class FunTest04 {

	//call by value
	public static void swap(int x, int y) {
		//swap 알고리즘
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("swap() 결과 값");
		System.out.println("x="+x+"\t"+"y="+y);
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() 호출 전");
		System.out.println("a="+a+"\t"+"b="+b);
		
		swap(a,b);
		
		System.out.println("swap() 호출 후");
		System.out.println("a="+a+"\t"+"b="+b);
	}
}
