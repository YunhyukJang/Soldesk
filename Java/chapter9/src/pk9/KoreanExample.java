package pk9;

public class KoreanExample {

	public static void main(String[] args) {
		Korea info1=new Korea("짱구", "111111-1111111");
		
		System.out.println(info1.nation);
		System.out.println(info1.name);
		System.out.println(info1.ssn);
		
		Korea info2=new Korea("철수", "222222-2222222");
		
		System.out.println(info2.nation);
		System.out.println(info2.name);
		System.out.println(info2.ssn);
		
		Korea info3=new Korea();
		System.out.println(info3.nation);
		System.out.println(info3.name);
		System.out.println(info3.ssn);
	}
}
