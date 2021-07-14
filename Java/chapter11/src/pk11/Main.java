package pk11;

public class Main {

	public static void main(String[] args) {
		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar()); //자식
		System.out.println(c1.getMoney()+"원"); //부모
		
		//ChildExam은 곧 ParentExam
		//instanceof=연산자
		//왼쪽의 객체가 오른쪽의 클래스의 인스턴스(즉 그 클래스로 만든 객체)
		if(c1 instanceof ParentExam) {
			System.out.println("c1은 ParentExam의 자식 클래스입니다.");
		}
		
		ChildExam ch=new ChildExam();
		ParentExam p1=new ParentExam();
		
		p1=ch; //자동 형 변환
		ch=(ChildExam)p1;
		
		//자식은 부모의 메서드와 자기 자신의 메서드를 모두 사용
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
		//반면 부모는 부모의 기능만 사용
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
	}
}
