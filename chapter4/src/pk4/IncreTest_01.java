package pk4;

public class IncreTest_01 {

	public static void main(String[] args) {
		int a, b, c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a="+(++a)); //a=a+1 or a+=1
		
		System.out.println("a++ ="+(a++));
		System.out.println(a);
		
		System.out.println("c++ ="+(c++));
		System.out.println(c);
		
		//a 전위 계산+b 후위 계산
		System.out.println("(++a)+(b++)="+((++a)+(b++)));
		System.out.println(b);
	}
}
