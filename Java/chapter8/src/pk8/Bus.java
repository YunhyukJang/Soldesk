package pk8;

public class Bus {
	//멤버 변수
	int busNumber; //버스 번호
	int passengerCount; //승객 수
	int money; //버스 수입
	
	//생성자를 오버로딩(버스 번호를 매개 변수로 받아서 멤버 변수에 대입)
	public Bus(int busNumber) {
		this.busNumber=busNumber;
		
	}
	
	public void take(int money) { //승객이 낸 돈을 받음
		this.money += money; //버스의 수입 증가
		
		passengerCount++; //승객 수 증가
	}
	
	public void showInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"명이고, 수입은 "+
	money+"원 입니다.");
	}
}
