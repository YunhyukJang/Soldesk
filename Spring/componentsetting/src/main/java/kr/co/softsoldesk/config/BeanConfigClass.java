package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean2;

@Configuration
@ComponentScan(basePackages="kr.co.softsoldesk.beans")
public class BeanConfigClass {
	@Bean
	public TestBean2 t5() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean2 t6() {
		return new TestBean2();
	}
}
