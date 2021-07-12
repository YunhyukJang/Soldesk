package pk10;

public class Student2Main {

	public static void main(String[] args) {
		Student2 studentHarry=new Student2();
		
		studentHarry.setStudentName("해리");
		
		System.out.println("이름:"+studentHarry.studentName+" 학번:"+studentHarry.studentID);
		
		Student2 studentRon=new Student2();
		
		studentRon.setStudentName("론");
		
		System.out.println("이름:"+studentRon.studentName+" 학번:"+studentRon.studentID);
	}
}
