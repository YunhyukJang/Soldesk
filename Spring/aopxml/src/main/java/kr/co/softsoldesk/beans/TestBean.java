package kr.co.softsoldesk.beans;

public class TestBean {
	/*
	public void method1() {
		System.out.println("method1 호출");
	}
	*/
	
	/*
	public int method1() {
		System.out.println("method1 호출");
		
		return 100;
	}
	*/
	
	//Error code -> afterReturningMethod이 호출 안 됨
	public int method1() {
		System.out.println("method1 호출");
		
		int a1=10/0;
		
		return 100;
	}
}
