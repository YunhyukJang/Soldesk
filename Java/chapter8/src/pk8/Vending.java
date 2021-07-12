package pk8;

public class Vending {
	//멤버 변수
	private Can can[]=new Can[5];
	private int money;
	
	//생성자 생략
	
	//초기화 메서드 init()
	public void init() {
		can[0]=new Can("코카콜라", 800);
		can[1]=new Can("칠성사이다", 800);
		can[2]=new Can("제로콜라", 1000);
		can[3]=new Can("스프라이트", 900);
		can[4]=new Can("환타", 900);
	}
	
	public void showCans(int m) {
		money=m;
		
		//손님의 돈으로 살 수 있는 음료만 보여주기
		for(int i=0; i<can.length; i++) {
			if(can[i].getPrice()<=m) {
				System.out.println(can[i].getCanName()+" -> "+can[i].getPrice()+"원");
			}
			
		}
		
	}
	
	//선택한 음료 제공 후 잔액을 계산해서 주는 메서드
	public void outCans(String name) {
		for(int i=0; i<can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"을(를) 선택하셨습니다.");
				System.out.println("거스름돈은 "+(money-can[i].getPrice())+"원 입니다.");
			}
			
		}
		
	}
}
