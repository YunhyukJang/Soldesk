package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Project의 전반적인 설정
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer {
	//Controller의 메서드가 반환하는 결과 값을 view로 보낼 때 지정되어지는 경로 구현
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	//정적 파일의 경로 지정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/**").addResourceLocations("/resource/");
	}
}
