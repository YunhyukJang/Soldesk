package pk11;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student("해리", "111111-1111111", 1);
		
		System.out.println("name:"+student.name);
		System.out.println("ssn:"+student.ssn);
		System.out.println("studentNo:"+student.studentNo);
	}
}
