package jspbook.ch07;

public class LoginBean {
	private String id;
	private String pw;
	
	//Oracle에서 가져온 아이디와 비밀번호
	final String _id="user";
	final String _pw="12345";
	
	//DB의 로그인 정보와 일치하는지 확인하는 메서드
	public boolean checkUser() {
		if(id.equals(_id) && pw.equals(_pw)) {
			return true;
		}else {
			return false;
		}
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
