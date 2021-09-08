package jspbook.ch13;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//관리자 mode시 filter 기능 실습
@WebFilter("/chapter13/admin/*")
public class AdminFilter implements Filter {
	Properties p;
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		p=(Properties)request.getServletContext().getAttribute("prop");
		
		//추가
		p.put("adminID", "superUser");
		
		//request에 tel 추가
		request.setAttribute("tel", "010-0000-0000");
		
		//Filter 처리 종료, 다음 filter로 제어권을 넘김
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}
