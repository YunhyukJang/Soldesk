package pk10;

public class Guest {
	//필드=이름과 성별 private
	private String gName;
	private String gGender;
	
	public String getPoint() {
		//객체 생성으로 접근해야 하지만 static이므로 클래스명으로 접근 가능
		return Guide.point;
	}
	
	//getter/setter
	public String getgName() {
		return gName;
	}
	
	public void setgName(String gName) {
		this.gName = gName;
	}
	
	public String getgGender() {
		return gGender;
	}
	
	public void setgGender(String gGender) {
		this.gGender = gGender;
	}
}
