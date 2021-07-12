package pk7;

public class EX1_Overloading {
	//필드=멤버 변수
	
	//생성자 생략(default 생성자)
	
	//메서드 구현
	//메서드 중복 허용=Overloading=클래스에 동일한 이름의 메서드가 존재
	//Overloading(다형성)=유지보수 관리의 효율성을 극대화
	public void getResult(int n) {
		System.out.println(n+"은(는) int입니다.");
	}
	
	public void getResult(char n) {
		System.out.println(n+"은(는) char입니다.");
	}
	
	public void getResult(String n) {
		System.out.println(n+"은(는) String입니다.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n+"은(는) int, "+str+"은(는) String입니다.");
	}
}
