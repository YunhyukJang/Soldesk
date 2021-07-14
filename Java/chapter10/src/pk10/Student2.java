package pk10;

public class Student2 {
	public static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//기본 생성자를 활용하여 serialNum을 하나씩 증가하는 구현부
	public Student2() {
		serialNum++;
		
		this.studentID=serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
