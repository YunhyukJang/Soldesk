package pk7;

public class FunTest05 {
	
	int value; //멤버 변수
	
	//오버로딩된 생성자는 default 생성자가 반드시 명시되어야 한다.
	//default 생성자
	//public FunTest() {}
	
	//생성자=클래스의 초기화
	FunTest05(int value){
		this.value=value; //this="클래스에 있는"
	}
	
	public static void swap(FunTest05 x, FunTest05 y) {
		int temp=x.value;
		x.value=y.value;
		y.value=temp;
		
		System.out.println("swap() 결과 값");
		System.out.println("x="+x.value+"\t"+"y="+y.value);
	}

	public static void main(String[] args) {
		FunTest05 a=new FunTest05(10);
		
		System.out.println(a);
		
		FunTest05 b=new FunTest05(20);
		
		System.out.println(b);
		
		System.out.println("swap() 호출 전");
		System.out.println("a="+a.value+"\t"+"b="+b.value);
		
		//객체로 접근하여 호출
		swap(a,b);
		
		//heap 메모리 참조 후 값이므로 바뀜
		System.out.println("swap() 호출 후");
		System.out.println("a="+a.value+"\t"+"b="+b.value);
	}
}
