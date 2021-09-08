package jspbook.ch13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/PropertyServlet"}, initParams={@WebInitParam(name="name1", value="user1"), 
		@WebInitParam(name="name2", value="user2")})
public class PropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//get 방식으로 요청 처리를 호출받아도 post 방식의 메서드 적용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답(response.Writer())으로 내보낼 출력 스트림을 얻어냄
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html; charset=UTF-8");
		
		out.println("<html><body><center>");
		out.println("<h2>Property Servlet</h2>");
		out.println("<hr/>");
		
		out.println("name1 -> "+getInitParameter("name1")+"<br/>");
		out.println("name2 -> "+getInitParameter("name2")+"<br/>");
		
		//web.xml의 data 호출
		out.println("name3 -> "+getServletContext().getInitParameter("name3"));
		
		out.println("<center><body><html>");
	}
}

/*
 * serialVersionUID=1L;
 * 직렬화=Java system 내부에서 사용되는 객체 또는 data를 byte 신호로 바꿔서 외부의 Java system에서도 사용할 수 있도록 
 * 만들어주는 기술
 * 역직렬화=byte로 변환된 객체 또는 data를 원래의 객체 또는 data로 변환하는 기술
 * 
 * 지금의 Java system내에서 기술 담당은 JVM이 해주고 있다.
 */