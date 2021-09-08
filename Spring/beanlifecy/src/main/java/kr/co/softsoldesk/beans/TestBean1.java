package kr.co.softsoldesk.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
	
	public void bean1_init() {
		System.out.println("TestBean1의 bean1_init 메서드");
	}
	
	public void bean1_destroy() {
		System.out.println("TestBean1의 bean1_destroy 메서드");
	}
}
