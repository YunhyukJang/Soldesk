package pk11;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //오버로딩된 부모 생성자 호출=People(name, ssn)
		
		this.studentNo=studentNo;
	}
}
