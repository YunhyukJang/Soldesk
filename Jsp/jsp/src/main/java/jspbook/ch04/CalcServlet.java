package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet 방식을 사용하지 않으므로 doPost 방식을 호출
		doPost(request, response);
	}
	
	//POST 요청을 처리하기 위한 메서드
	//doGet에서도 처리할 수 있도록 하기 위해 doPost()로 정의
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//멤버변수
		int num1, num2;
		String op="";
		int result;
		
		response.setContentType("text/html; charset=UTF-8");
		
		//클라이언트의 요청을 출력하기 위한 출력 스트림 설정
		PrintWriter out=response.getWriter();
		
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
		op=request.getParameter("operator");
		
		Calc calc=new Calc(num1, num2, op);
		
		result=calc.getResult();
		
		out.println("<html>");
		out.println("<head><title>계산기</title></head>");
		out.println("<body><center>");
		out.println("<h2>결과</h2>");
		out.println("<hr/>");
		out.println(num1+op+num2+"="+result);
		out.println("</body></html>");
	}
}
