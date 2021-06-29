package pk15;

public class StaticInner {
	int a=10;
	private int b=100;
	static int c=300;
	
	static class Inner{
		static int d=1000;
		
		public void getData() {
			//System.out.println("int a="+a); *생존 주기가 다르므로 불가
			//System.out.println("private int b="+b); *생존 주기가 다르므로 불가
			System.out.println("static int c="+c);
		}
	}

	public static void main(String[] args) {
		StaticInner.Inner obj=new StaticInner.Inner();
		
		obj.getData();
	}
}
