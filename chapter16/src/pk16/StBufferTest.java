package pk16;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		
		StringBuffer buf=new StringBuffer("Smooth like butter");
		
		//toString()=문자열 처리
		System.out.println(buf.toString());
		
		//length()=문자열 크기
		System.out.println(buf.length());
		
		//capacity()=문자열 용량 *기본 16+문자열 크기
		System.out.println(buf.capacity());
		
		//ensureCapacity()=문자열 용량 증가 *현재 용량보다 큰 수로 매개 변수 사용 시 2배+2
		//2배+2 이상의 수 대입 시 대입한 크기로 반환하지만 지향함
		buf.ensureCapacity(30);
		
		System.out.println(buf.capacity());
		
		//insert()=문자열에 새로운 문자열 삽입
		buf.insert(0, "Butter");
		
		System.out.println(buf);
		
		//delete()=문자열의 일부 내용 제거
		buf.delete(0, 6);
		
		System.out.println(buf);
	}
}
