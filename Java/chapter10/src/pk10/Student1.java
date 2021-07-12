package pk10;

public class Student1 {
	public static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static int getSerialNum() {
		int i=10;
		
		return serialNum;
	}
}
