package kr.co.softsoldesk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor3 implements HandlerInterceptor {
	//Controller의 메서드가 호출되기 전에 호출
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Test interceptor3-preHandle");
		
		return true; //요청 처리에 대한 진행이 중지됨
	}
	
	//Controller의 메서드가 호출된 후에 호출
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Test interceptor3-postHandle");
	}
	
	//View 처리까지 완료되면 호출
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Test interceptor3-afterCompletion");
	}
}
