package pk12_2;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//template=변경 불가한 프로젝트의 틀
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
