package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//#1
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#2
		TestBean t1=ctx.getBean("test1", TestBean.class);
		
		System.out.printf("t1 -> %s\n", t1);
		
		TestBean t2=ctx.getBean("test1", TestBean.class);
		
		System.out.printf("t2 -> %s\n", t2);
		
		//#3
		TestBean t3=ctx.getBean("test2", TestBean.class);
		
		System.out.printf("t3 -> %s\n", t3);
		
		TestBean t4=ctx.getBean("test2", TestBean.class);
		
		System.out.printf("t4 -> %s\n", t4);
		
		//#4
		TestBean t5=ctx.getBean("test3", TestBean.class);
		
		System.out.printf("t5 -> %s\n", t5);
		
		TestBean t6=ctx.getBean("test3", TestBean.class);
		
		System.out.printf("t6 -> %s\n", t6);
		
		ctx.close();
	}
}
