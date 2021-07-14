package pk12;

//라이브러리
import test.Customer;
import test.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerSin=new Customer(10000, "신짱구");
		
		customerSin.bonusPoint=100;
		
		System.out.println(customerSin.showCustomerInfo());
		
		System.out.println("-------------------------VIP-------------------------");
		
		Customer customerKim=new VIPCustomer(10001, "김철수", 1);
		
		customerKim.bonusPoint=1000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		int price=10000;
		
		System.out.println(customerSin.getCustomerName()+"님이 지불하셔야할 금액은 "
		+customerSin.calPrice(price)+"원입니다.");
		System.out.println(customerKim.getCustomerName()+"님이 지불하셔야할 금액은 "
				+customerKim.calPrice(price)+"원입니다.");
	}
}
