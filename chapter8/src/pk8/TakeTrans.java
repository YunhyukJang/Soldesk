package pk8;

public class TakeTrans {

	public static void main(String[] args) {
		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentTomas=new StdInfo("Tomas", 10000);
		StdInfo studentHarry=new StdInfo("Harry", 3000);
		StdInfo studentRon=new StdInfo("Ron", 3000);
		
		Bus bs100=new Bus(100);
		
		studentJames.takeBus(bs100);
		studentJames.showInfo();
		
		studentHarry.takeBus(bs100);
		studentHarry.showInfo();
		
		bs100.showInfo();
		
		Subway subwayGreen=new Subway("2");
		
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		
		studentRon.takeSubway(subwayGreen);
		studentRon.showInfo();
		
		subwayGreen.showInfo();
	}
}
