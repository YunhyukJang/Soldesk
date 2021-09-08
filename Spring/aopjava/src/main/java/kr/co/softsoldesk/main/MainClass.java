package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean xml1=ctx1.getBean(TestBean.class);
		
		//xml1.method1();
		
		try {
			xml1.method1();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean java1=ctx2.getBean(TestBean.class);
		
		//java1.method1();
		
		try {
			java1.method1();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ctx2.close();
	}
}
