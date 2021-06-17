package pk8;

public class MyDateMain {

	public static void main(String[] args) {
		//2021년 6월 17일
		MyDate today=new MyDate();
		
		today.year=2021;
		today.month=6;
		today.day=17;
		
		System.out.println(today.year+"년 "+today.month+"월 "+today.day+"일");
	}
}
