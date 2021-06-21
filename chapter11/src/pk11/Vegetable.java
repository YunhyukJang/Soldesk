package pk11;

public class Vegetable {
	String sort;
	String season;
	String name;
	
	//메서드를 활용하여 멤버 변수 set
	public void Set1(String sort, String season, String name) {
		this.sort=sort;
		this.season=season;
		this.name=name;
	}
	
	//메서드를 활용하여 멤버 변수 get
	public void Disp1() {
		System.out.println("분류:"+sort);
		System.out.println("계절:"+season);
		System.out.println("이름:"+name);
	}
}
