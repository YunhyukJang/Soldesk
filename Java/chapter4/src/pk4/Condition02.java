package pk4;

public class Condition02 {

	public static void main(String[] args) {
		int x, y, z;
		
		x=10;
		y=20;
		
		//x가 y보다 크면 x, 아니면 y
		z=(x>y) ? x : y;
		
		System.out.println(z);
		
		//y가 x보다 크면 x, 아니면 y
		z=(x<y) ? x : y;
		
		System.out.println(z);
	}
}
