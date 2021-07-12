package pk12_2;

public class PhoneExample {
	
	public static void main(String[] args) {
		//추상 클래스는 heap 메모리를 사용할 수 없다.
		//Phone phone=new Phone();
		//Phone phone=new Phone("신짱구");
		SmartPhone smart=new SmartPhone("신짱구");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
	}
}
