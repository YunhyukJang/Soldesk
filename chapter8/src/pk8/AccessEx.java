package pk8;

//접근한정자 실습
public class AccessEx {
	//멤버 변수
	private int aa; //은닉화(동일 클래스에서만 사용 가능)
	public int bb; //공통
	int cc; //패키지가 같으면 사용 가능
	
	//메서드
	public void SetA(int a) {
		aa=a; //private이여도 public 메서드를 통해서 외부에서 사용 가능
	}
	
	public void SetB(int b) {
		bb=b;
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa 값="+aa+"\nbb 값="+bb+"\ncc 값="+cc);
	}

	public static void main(String[] args) {
		AccessEx obj=new AccessEx();
		
		//obj.aa=10; *멤버 변수 직접 접근
		obj.SetA(10); //메서드로 변수 초기화
		obj.bb=20;
		//obj.cc=30;
		obj.SetC(30);
		obj.Disp();
	}
}
