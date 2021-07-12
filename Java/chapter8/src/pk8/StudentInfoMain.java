package pk8;

public class StudentInfoMain {

	public static void main(String[] args) {
		//get/set을 활용하여 학생 이름을 출력하라
		StudentInfo student=new StudentInfo();
		
		student.setStudentName("장윤혁");
		
		System.out.println(student.getStudentName());
	}
}
