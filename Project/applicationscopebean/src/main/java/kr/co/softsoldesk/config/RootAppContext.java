package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;

//Project 작업 시 DB VO를 정의하는 class
@Configuration
public class RootAppContext {
	@Bean
	@ApplicationScope
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
	
	@Bean(name="applicationBean2")
	@ApplicationScope
	public DataBean2 dataBean2() {
		return new DataBean2();
	}
}
