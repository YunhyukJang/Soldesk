package pk15;

class OutClass{
	//외부 클래스 멤버 변수
	private int num=0;
	private static int sNum=20;
	private InClass inClass; //선언
	
	//생성자를 통해서 내부 클래스의 객체를 생성한다.
	public OutClass() {
		inClass=new InClass(); //내부 클래스의 객체 생성
	}
	
	//내부 인스턴스 클래스
	class InClass{
		int inNum=100;
		
		void inTest() {
			System.out.println("OutClass int num="+num+" -> 외부 클래스 인스턴스 변수");
			System.out.println("OutClass static int sNum="+sNum+" -> 외부 클래스 전역 변수");
			System.out.println("InClass int inNum="+inNum+" -> 내부 클래스 인스턴스 변수");
		}
		
	}
	
	//private 멤버 변수 시 사용 권장
	public void usingClass() {
		inClass.inTest();
	}
	
	//내부 정적(static) 클래스
	static class InStaticClass{
		int inNum=100;
		static int sinNum=200;
		//num=500; *객체가 있어야 사용 가능
		
		void inTest() {
			//num=500; *객체가 있어야 사용 가능
			inNum=101;
			sinNum=201;
			sNum=301;
			
			System.out.println("InStaticClass inNum="+inNum+" -> 내부 클래스 인스턴스 변수");
			System.out.println("InStaticClass sinNum="+sinNum+" -> 내부 클래스 static 변수");
			System.out.println("InStaticClass sNum="+sNum+" -> 내부 클래스 static 변수");
		}
		
		static void sTest() {
			sinNum=200; //InStaticClass
			sNum=300; //외부
			//inNum=100; *생명 주기가 틀림
			
			System.out.println("InStaticClass sinNum="+sinNum+" -> 내부 클래스 static 변수");
			System.out.println("OutClass sNum="+sNum+" -> 외부 클래스 static 변수");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		System.out.println("private으로 변수 접근 시 호출");
		
		OutClass outClass1=new OutClass();
		
		outClass1.usingClass();
		
		System.out.println();
		System.out.println("외부 클래스 생성 후 내부 클래스 호출");
		
		OutClass outClass2=new OutClass();
		
		OutClass.InClass inClass=outClass2.new InClass();
		
		inClass.inTest();
		
		//외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass inStatic=new OutClass.InStaticClass();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 일반 메서드");
		
		inStatic.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스의 static 메서드");
		
		inStatic.sTest();
	}
}
