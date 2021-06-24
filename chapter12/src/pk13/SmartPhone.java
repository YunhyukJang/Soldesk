package pk13;

public class SmartPhone extends Phone {
	public SmartPhone(String owner) { //생성자 안에 생성자 호출
		super(owner); //super(Owner)=Phone(owner)
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
