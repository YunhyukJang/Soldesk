package FlyVO;

public class FlyChoiceAirGuide {
	String tName;
	String story;
	
	public FlyChoiceAirGuide(String tName,  String story){
		this.tName = tName;
		this.story = story;
		}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}  
	
	
}