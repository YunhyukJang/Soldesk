package pk12;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		//방법 1
		driver.driver(new Bus());
		driver.driver(new Taxi());
		
		//방법 2
		Bus bus=new Bus();
		Taxi taxi=new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);
	}
}
