package pk17_2;

public class GenericMethod {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		//가로 T
		double left=((Number)p1.getX()).doubleValue(); //0
		double right=((Number)p2.getX()).doubleValue(); //10
		
		//세로 V
		double top=((Number)p1.getY()).doubleValue(); //0.0
		double bottom=((Number)p2.getY()).doubleValue(); //10.0
		
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}

	public static void main(String[] args) {
		//매개 변수
		Point<Integer, Double> p1=new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2=new Point<Integer, Double>(10, 10.0);
		
		double rec=GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		
		System.out.println("사각형의 넓이="+rec);
	}
}
