package pk4;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 원의 넓이를 구해라 
		 * 원의 넓이=반지름*반지름*PI 
		 * 반지름=10
		 */
		
		//int -> Double.parseDouble
		//String -> Integer.parseInt
		
		int radius=10;
		double PI=3.14;
		double circle;
		
		circle=radius*radius*PI;
		
		System.out.println(circle);
	}
}
