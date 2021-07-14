package pk12;

import test.Customer;
import test.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc=new VIPCustomer(10, "피오", 10001);
		
		vc.bonusPoint=1000; //Customer 타입이므로 Customer 변수 사용
		
		System.out.println(vc.getCustomerName()+"님이 지불하셔야할 금액은 "
		+vc.calPrice(10000)+"원입니다.");
	}
}
