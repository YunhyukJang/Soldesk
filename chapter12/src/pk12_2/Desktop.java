package pk12_2;

public class Desktop extends Computer {
	//추상 클래스를 상속받았을 때는 반드시 추상 클래스의 구현부를 완성해야 한다.
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
}
