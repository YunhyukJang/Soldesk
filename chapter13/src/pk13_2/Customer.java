package pk13_2;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	//필수 아님(default에서 재정의)
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
}
