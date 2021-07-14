package pk19;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		ArrayList<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		TravelCustomer customer1=new TravelCustomer("신형만", 35, 100);
		TravelCustomer customer2=new TravelCustomer("봉미선", 29, 100);
		TravelCustomer customer3=new TravelCustomer("신짱구", 5, 50);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		System.out.println("===모든 고객 명단 출력===");
		
		//각 객체의 요소중 이름만 mapping하여 출력
		customerList.stream().map(n -> n.getName()).forEach(r -> System.out.println(r));
		
		//price만 mapping하여 sum()으로 합계 출력
		int total=customerList.stream().mapToInt(p -> p.getPrice()).sum();
		
		System.out.println("총 여행 경비:"+total+"원");
		
		System.out.println("===성인 고객 이름 출력===");
		
		customerList.stream().filter(a -> a.getAge() >= 20).map(n -> n.getName()).sorted().forEach(r -> System.out.println(r));
	}
}
