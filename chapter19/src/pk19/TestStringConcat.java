package pk19;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="world";
		
		//방법 1:has a
		StringConcatImp concat1=new StringConcatImp();
		
		concat1.makeString(s1, s2);
		
		//방법 2:lambda
		StringConcat concat2=(s, v) -> System.out.println(s+", "+v);
		
		concat2.makeString("Lucky", "day");
		
		//방법 3:익명의 클래스
		StringConcat concat3=new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			}
			
		};
		
		concat3.makeString("Happy", "day");
	}
}
