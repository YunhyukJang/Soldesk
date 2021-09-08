package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean bean1=ctx.getBean("xml1", TestBean.class);
		
		//bean1.method1();
		
		//반환값을 가져오는 메서드는 after가 실행된 후 값을 받아온다.
		int a1=bean1.method1();
		
		System.out.println("a1 -> "+a1);
		
		ctx.close();
	}
}
