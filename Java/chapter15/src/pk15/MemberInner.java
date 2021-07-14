package pk15;

public class MemberInner {
	//멤버 변수
	int a=10;
	private int b=100;
	static int c=200;
	
	//내부 클래스
	class Inner{
		public void printDate() {
			System.out.println("int a="+a);
			System.out.println("private int b="+b);
			System.out.println("static int c="+c);		
		}
	}

	public static void main(String[] args) {
		//main 클래스 객체 생성
		MemberInner outer=new MemberInner(); 
		
		//내부 클래스 객체 생성
		//main 클래스의 객체 outer를 통해서 객체를 생성해야 한다.
		MemberInner.Inner inner=outer.new Inner();
		//=MemberInner.Inner inner=new MemberInner().new Inner();
		
		inner.printDate();
	}
}
