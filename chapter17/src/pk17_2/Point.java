package pk17_2;

public class Point<T, V> {
	//멤버 변수
	T x;
	V y;
	
	//생성자
	public Point(T x, V y) {
		this.x=x;
		this.y=y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
