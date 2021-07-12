package pk8;

public class Subway {
	public String lineNumber; //지하철 노선
	public int passengerCount; //승객 수
	public int money; //지하철 수입
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) { //승객이 탄 경우
		this.money += money; //지하철의 수입 증가
		
		passengerCount++; //승객 수 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"호선의 승객은 "+passengerCount+"명이고, 수입은 "+
	money+"원 입니다.");
	}
}
