package jspbook.ch13;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

@WebFilter("*.jsp")
public class EncFilter implements Filter {
	private String encoding;
	
	public void destroy() {
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding=fConfig.getServletContext().getInitParameter("encoding");
	}

	//Filter 적용 부분 구현
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//Encoding이 안되있는 경우에만 적용하도록 제어
		if(request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
			
			chain.doFilter(request, response);
		}
		
	}
}
