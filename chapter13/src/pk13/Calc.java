package pk13;

public interface Calc {
	/*
	 * 인터페이스의 추가 요소(단, 자바 버젼 8이상)
	 * -default method=기본 구성을 가지는 메서드로써 구현 클래스에서 재정의가 가능하다.
	 * -정적(static)=인스턴스 생성과는 상관없이 클래스 타입으로 사용 가능하다.
	 */
	
	//interface는 only heap memory
	//아무것도 선언하지 않아도 public static final double PI=3.14
	double PI=3.14;
	int ERROR=-9999999;
	
	public abstract int add(int num1, int num2); //public abstract 생략 가능
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default method=재정의가 가능하다. (상속받는 클래스에서 재정의 가능)
	default void description() {
		System.out.println("정수 계산기입니다.");
	}
	
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total += i;
		}
		
		return total;
	}
}
