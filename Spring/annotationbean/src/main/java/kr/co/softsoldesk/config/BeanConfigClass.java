package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	//#1
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	//#2
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	//#3은 자동 주입으로 선언하지 않음
	
	//#4
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	//#5
	//등록되어 있지 않으면 자동 주입이 되지 않음
	/*
	@Bean
	public DataBean2 obj6() {
		return new DataBean2();
	}
	*/
	
	//TestBean2
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
}
