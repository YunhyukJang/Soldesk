package pk7;

public class Method {
	//필드 생략=멤버 변수
	
	//생성자 생략(기본 생성자를 사용)
	
	void makeBread() {
		System.out.println("빵을 만들었다.");
	}
	
	void makeBread(int count) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 빵을 만들었다.");
		}
		
		System.out.println(count+"개의 빵이 모두 완성되었다.");
	}
	
	void makeBread(int count, String name) {
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 "+name+"빵을 만들었다.");
		}
		
		System.out.println(count+"개의 "+name+"빵이 모두 완성되었다.");
	}
}
