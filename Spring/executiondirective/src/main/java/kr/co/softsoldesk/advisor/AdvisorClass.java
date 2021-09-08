package kr.co.softsoldesk.advisor;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
}
