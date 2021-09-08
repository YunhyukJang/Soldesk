package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	private int price;
	private SonySpeaker sony;
	
	public SamsungTV(SonySpeaker sony, int price) {
		System.out.println("SamsungTV 객체 생성");
		
		this.sony=sony;
		this.price=price;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV Power on");
		System.out.println("가격 -> "+price);
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV Power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker Volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker Volume down");
	}
}
