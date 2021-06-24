package pk13;

public abstract class Phone {
	public String owner;
	
	//default 생성자가 선언만 되어있고 구현되지 않음 *추상 생성자??
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
