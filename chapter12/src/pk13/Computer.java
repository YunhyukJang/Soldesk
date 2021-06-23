package pk13;

public abstract class Computer {
	//하나 이상의 추상 메서드가 들어있으면 반드시 추상 클래스여야 한다. *abstract 명시
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
