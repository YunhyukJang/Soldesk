package pk15;

public class LocalInnerTest {
	int a=100; //필드
	
	public void innerTest(int n) { //로컬 메서드
		int b=200; //지역 변수
		final int c=n; //상수
		
		class Inner{
			public void getData() {
				System.out.println("int a="+a);
				System.out.println("int b="+b);
				System.out.println("final int c="+c);
			}
			
		}
		
		Inner i=new Inner();
		
		i.getData();
	}

	public static void main(String[] args) {
		LocalInnerTest lit=new LocalInnerTest();
		
		lit.innerTest(500); //outer에서 정의한 메서드(내부 클래스가 아님)
	}
}
