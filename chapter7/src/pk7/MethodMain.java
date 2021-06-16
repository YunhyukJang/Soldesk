package pk7;

public class MethodMain {

	public static void main(String[] args) {
		//참조하고 싶은 클래스의 메모리 객체(mh) 생성(기본 생성자 사용)
		Method mh=new Method();
		
		mh.makeBread();
		
		mh.makeBread(5);
		
		mh.makeBread(5, "초코소라");
	}
}
