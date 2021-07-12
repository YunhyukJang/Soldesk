package pk10;

public class Company {
	//객체를 단 하나만 생성
	private static Company instance=new Company();
	
	private Company() {
	}
	
	public static Company getInstance() {
		if(instance == null) { //객체를 생성한 적이 없다면
			instance=new Company();
		}
		
		return instance;
	}
}
