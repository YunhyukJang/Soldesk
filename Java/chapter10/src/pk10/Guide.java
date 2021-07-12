package pk10;

/*스태틱 변수 point를 가지는 Guide 클래스를 만들고 
 * 이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
 * 최초 실행 시 등록할 관광객 수를 지정.
 * 지정한 수 만큼 Guest 클래스의 배열로 만듬*/
public class Guide {
	static String point;
	Guest[] guest;
	
	//생성자에서 초기화
	public Guide(int n) {
		point="가거도";
		//배열의 메모리 확보
		guest=new Guest[n];
		
		for(int i=0; i<guest.length; i++) {
			guest[i]=new Guest();
		}
		
	}
}
