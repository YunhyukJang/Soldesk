package jspbook.ch11;

public class Member {
	private String name;
	private String email;
	
	public Member() {
		name="김연아";
		email="yuna@gmail.com";
	}
	
	public Member(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
