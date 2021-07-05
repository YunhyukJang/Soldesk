package collection.hashmap;

public class Student {
	public int sNo;
	public String sName;
	
	public Student(int sNo, String sName) {
		this.sNo=sNo;
		this.sName=sName;
	}
	
	/* hashCode가 재정의(물리적인 주소)되어있지 않으면 super class의 주소를 반환하므로 
	 * sNo로 재정의하여 entry의 중복 생성을 막아줘야한다. 
	 * 일반적으로 equals(논리적인 주소)를 통해 재정의된 멤버 변수를 사용한다. */
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			
			return (sNo == student.sNo) && (sName.equals(student.sName));
		}else {
			return false;
		}
	}
	
	//hashCode의 주소를 sNo와 sName으로 사용하도록 구현
	public int hashCode() {
		return sNo+sName.hashCode();
	}
}
