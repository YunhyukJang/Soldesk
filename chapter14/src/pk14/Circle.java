package pk14;

//복제는 private에 위배되므로 반드시 복제 권한(Cloneable)을 선언해야 한다.
public class Circle implements Cloneable {
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		//Point point=new Point(x, y); *Point 클래스의 객체 생성
		point=new Point(x, y);
		
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "원점은 "+point+"이고 반지름은 "+radius+"입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
