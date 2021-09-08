package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	/*
	public void method1() {
		System.out.println("TestBean.method1()");
	}
	*/
	
	/*
	//afterReturningMethod
	public void method1() {
		System.out.println("TestBean.method1()");
		
		int a1=10/0;
	}
	*/
	
	//afterThrowingMethod
	public void method1() throws Exception {
		System.out.println("TestBean.method1()");
		
		int a1=10/0;
	}
}
