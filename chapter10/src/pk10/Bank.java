package pk10;

public class Bank {
	private String point; //은행 위치(지점)
	private String tel; //은행 전화번호
	static float interest; //은행 이자
	
	//생성자를 활용하여 point와 tel set
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	//결과를 출력할 메서드(get)
	public void getBank() {
		System.out.println("지점:"+point+"\n"+"전화번호:"+tel+"\n"+"이자:"+interest);
	}
}
