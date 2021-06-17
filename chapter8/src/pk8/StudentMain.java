package pk8;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		
		//필드를 사용하여 이름과 주소 출력
		student.studentName="김치즈";
		student.address="서울시 강서구";
		
		System.out.println("-----필드 이용-----");
		
		student.showStudent();
		
		//메서드를 사용하여 이름과 주소 출력
		student.setStudentName("박수");
		student.setAddress("경기도 고양시");
		
		System.out.println("-----메서드 이용-----");
		
		student.showStudent();
	}
}
