package pk13_2;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer=new Customer();
		
		System.out.println("-----Buy-----");
		
		Buy buy=customer;
		
		buy.buy();
		buy.order(); //오버라이딩된 order 출력
		
		System.out.println("-----Sell-----");
		
		Sell sell=customer;
		
		sell.sell();
		sell.order(); //오버라이딩된 order 출력
		
		if(buy instanceof Customer) {
			Customer customer1=(Customer)buy; //다운 캐스팅
			
			System.out.println("-----Down Casting-----");
			
			customer1.buy();
			customer1.sell();
		}
		
		System.out.println("-----Customer-----");
		
		customer.order();
	}
}
