package kr.co.softsoldesk.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
	
	public void init1() {
		System.out.println("TestBean1의 init1 메서드");
	}
	
	public void destroy1() {
		System.out.println("TestBean1의 destroy1 메서드");
	}
}
