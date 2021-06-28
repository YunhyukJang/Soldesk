package pk14;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return "학번:"+studentId+", 학생명:"+studentName;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	//equals(Student std)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std=(Student)obj;
			
			//Database에 있는 값과 입력값이 같은지 비교
			if(studentId == std.studentId) {
				return true;
			}else {
				return false;
			}
			
		}
		
		return false;
	}
}
