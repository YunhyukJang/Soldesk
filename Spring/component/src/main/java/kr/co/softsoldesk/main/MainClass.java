package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//Type으로 가져오기
		TestBean1 xml1=ctx1.getBean(TestBean1.class);
		
		System.out.printf("xml1 -> %s\n", xml1);
				
		//이름으로 가져오기
		TestBean2 xml2=ctx1.getBean("xml2", TestBean2.class);
		TestBean2 xml3=ctx1.getBean("xml3", TestBean2.class);
		
		System.out.printf("xml2 -> %s\n", xml2);
		System.out.printf("xml3 -> %s\n", xml3);
		
		//Component로 분석해서 가져오기
		TestBean3 xml4=ctx1.getBean(TestBean3.class);
		
		System.out.printf("xml4 -> %s\n", xml4);
		
		//Component 지정을 했으나 여러개로 사용할 경우 이름 지정
		TestBean4 xml100=ctx1.getBean("xml100", TestBean4.class);
		TestBean4 xml200=ctx1.getBean("xml200", TestBean4.class);
		
		System.out.printf("xml100 -> %s\n", xml100);
		System.out.printf("xml200 -> %s\n", xml200);
		
		//Component로 분석해서 가져오기
		TestBean5 xml5=ctx1.getBean(TestBean5.class);
		
		System.out.printf("xml5 -> %s\n", xml5);
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//Type으로 가져오기
		TestBean1 java1=ctx2.getBean(TestBean1.class);
		
		System.out.printf("java1 -> %s\n", java1);
				
		//이름으로 가져오기
		TestBean2 java2=ctx2.getBean("java2", TestBean2.class);
		TestBean2 java3=ctx2.getBean("java3", TestBean2.class);
		
		System.out.printf("java2 -> %s\n", java2);
		System.out.printf("java3 -> %s\n", java3);
		
		//Component로 분석해서 가져오기
		TestBean3 java4=ctx2.getBean(TestBean3.class);
		
		System.out.printf("java4 -> %s\n", java4);
		
		//Component 지정을 했으나 여러개로 사용할 경우 이름 지정
		TestBean4 java100=ctx2.getBean("java100", TestBean4.class);
		TestBean4 java200=ctx2.getBean("java200", TestBean4.class);
		
		System.out.printf("java100 -> %s\n", java100);
		System.out.printf("java200 -> %s\n", java200);
		
		//Component로 분석해서 가져오기
		TestBean5 java5=ctx2.getBean(TestBean5.class);
		
		System.out.printf("java5 -> %s\n", java5);
		
		ctx2.close();
	}
}
