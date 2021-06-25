package pk13;

public class SmartTelevision implements Searchable, Remote {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
			
			System.out.println("더 이상 음량을 높일 수 없습니다.");
		}else if(volume < Remote.MIN_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
			
			System.out.println("더 이상 음량을 줄일 수 없습니다.");
		}else {
			this.volume=volume;
		}
		
		System.out.println("현재 음량="+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을(를) 검색합니다.");
	}
}
