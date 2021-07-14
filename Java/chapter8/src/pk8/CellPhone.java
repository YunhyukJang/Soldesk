package pk8;

public class CellPhone {
	//필드
	String model;
	String color;
	
	//생성자
	
	//메서드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나:"+message);
	}
	
	public void receVoice(String message) {
		System.out.println("상대방:"+message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
