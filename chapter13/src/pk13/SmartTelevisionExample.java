package pk13;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		Remote RemoteSmart=new SmartTelevision();
		
		RemoteSmart.turnOn();
		RemoteSmart.setVolume(200);

		SmartTelevision smartTV=new SmartTelevision();
		
		smartTV.search("Butter");
		
		RemoteSmart.turnOff();
	}
}
