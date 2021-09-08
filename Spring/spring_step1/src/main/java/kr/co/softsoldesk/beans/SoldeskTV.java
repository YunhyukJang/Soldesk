package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV {
	public SoldeskTV() {
		System.out.println("SoldeskTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SoldeskTV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("SoldeskTV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SoldeskTV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SoldeskTV volume down");
	}
}
