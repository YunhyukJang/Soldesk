package pk10;

public class Student1Main {

	public static void main(String[] args) {
		Student1 studentLee=new Student1();
		
		studentLee.setStudentName("이영표");
		
		System.out.println(studentLee.serialNum);
		
		Student1.serialNum++;
		
		Student1 studentPark=new Student1();
		
		studentPark.setStudentName("박지성");
		
		System.out.println(studentPark.serialNum);
	}
}
