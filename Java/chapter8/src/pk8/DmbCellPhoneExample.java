package pk8;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone=new DmbCellPhone("Chocolate", "Black", 11);
		
		//CellPhone
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		//DmbCellPhone
		System.out.println("채널:"+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요 나야 거기 잘 지내니");
		dmbCellPhone.receVoice("....");
		dmbCellPhone.sendVoice("여보세요 왜 말 안하니");
		dmbCellPhone.receVoice("ㅜㅜ..");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}
}
