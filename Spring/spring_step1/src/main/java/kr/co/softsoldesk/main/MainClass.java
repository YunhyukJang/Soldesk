package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello1"); //HelloWorldKo
		
		callMethod(hello1);
		
		HelloWorld hello2=ctx.getBean("hello2", HelloWorld.class); //HelloWorldEn
		
		callMethod(hello2);
		
		ctx.close();
		
		/*
		 * HelloWorldKo hello1=new HelloWorldKo();
		 * 
		 * callMethod(hello1);
		 * 
		 * HelloWorldEn hello2=new HelloWorldEn();
		 * 
		 * callMethod(hello2);
		 */
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
