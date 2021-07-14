package pk14;

public class EqualsTest {

	public static void main(String[] args) {
		Student sHarry=new Student(10000, "Harry");
		Student sPotter=sHarry;
		Student sHarry1=new Student(10000, "Harry");
		
		System.out.println("-----동일한 주소의 두 인스턴스 비교-----");
		
		if(sHarry == sPotter) {
			System.out.println("sHarry와 sPotter는 동일한 주소입니다.");
		}else {
			System.out.println("sHarry와 sPotter는 다른 주소입니다.");
		}
		
		if(sHarry.equals(sPotter)) {
			System.out.println("sHarry와 sPotter는 동일 인물입니다.");
		}else {
			System.out.println("sHarry와 sPotter는 다른 인물입니다.");
		}
		
		System.out.println("-----다른 주소의 두 인스턴스 비교-----");
		
		if(sHarry == sHarry1) {
			System.out.println("sHarry와 sHarry1은 동일한 주소입니다.");
		}else {
			System.out.println("sHarry와 sHarry1은 다른 주소입니다.");
		}
		
		if(sHarry.equals(sHarry1)) {
			System.out.println("sHarry와 sHarry1은 동일 인물입니다.");
		}else {
			System.out.println("sHarry와 sHarry1은 다른 인물입니다.");
		}
		
		System.out.println("-----데이터 값 출력-----");
		System.out.println("sHarry의 hashCode="+sHarry.hashCode());
		System.out.println("sHarry1의 hashCode="+sHarry1.hashCode());
		
		System.out.println("-----Student의 실제 값 출력-----");
		System.out.println("sHarry의 실제 값="+System.identityHashCode(sHarry));
		System.out.println("sHarry1의 실제 값="+System.identityHashCode(sHarry1));
	}
}
