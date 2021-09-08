package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;

@Configuration
@ComponentScan(basePackages="kr.co.softsoldesk.beans2")
@ComponentScan(basePackages="kr.co.softsoldesk.beans3")
public class BeanConfigClass {
	//Type으로 선언
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	//이름으로 선언
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	//여러개를 지정할 경우 이름으로 선언
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
	
	//활용
	@Bean
	public TestBean5 java5() {
		return new TestBean5();
	}
}
