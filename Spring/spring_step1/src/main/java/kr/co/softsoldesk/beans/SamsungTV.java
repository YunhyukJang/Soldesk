package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV volume down");
	}
}
