package pk11;

public class CustomerTest {

	public static void main(String[] args) {
		//일반 고객 정보(Customer)
		Customer customerHarry=new Customer(); //고객 등급, 포인트 적용율
		
		customerHarry.setCustomerID(9); //customerID
		customerHarry.setCustomerName("Potter"); //customerName
		
		int price=10000;
		int harryPrice=customerHarry.calPrice(price); //bonusPoint
		
		System.out.println(customerHarry.showCustomerInfo());
		System.out.println(customerHarry.getCustomerName()+"님이 "+harryPrice+"원을 지불했습니다.");
		
		System.out.println("-------------------------VIP-------------------------");
		
		VIPCustomer vipRon=new VIPCustomer(7, "Weasley", 1007);
		
		int ronPrice=vipRon.calPrice(price);
		
		System.out.println(vipRon.showCustomerInfo());
		System.out.println(vipRon.getCustomerName()+"님이 "+ronPrice+"원을 지불했습니다.");
	}
}
