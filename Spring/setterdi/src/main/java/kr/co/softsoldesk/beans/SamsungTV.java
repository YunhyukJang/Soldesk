package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	private AppleSpeaker apple;
	private int price;
	
	public SamsungTV() {
	}
	
	public void powerOn() {
		System.out.println("SamsungTV Power on");
		System.out.println("가격 -> "+price);
	}
	
	public void powerOff() {
		System.out.println("SamsungTV Power off");
	}
	
	public void volumeUp() {
		apple.volumeUp();
	}
	
	public void volumeDown() {
		apple.volumeDown();
	}
	
	public AppleSpeaker getApple() {
		return apple;
	}
	
	public void setApple(AppleSpeaker apple) {
		this.apple = apple;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
