package pk20;

public class IDFormatTest {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IDFormatException {
		if(userId == null) {
			//Exception
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userId.length() <= 8 || userId.length() >= 20) {
			throw new IDFormatException("아이디는 8글자 이상 20자 이하로 생성하세요.");
		}
		
		this.userId = userId;
	}

	public static void main(String[] args) {
		IDFormatTest test=new IDFormatTest();
		
		String userId=null;
		
		try {
			test.setUserId(userId);
		}catch(IDFormatException e) {
			//코드와 메시지 출력
			System.out.println(e);
			//getMessage()=java.lang에서 String 타입에 정의되어 있다.
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------------------------");
		
		userId="1234567";
		
		try {
			test.setUserId(userId);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
