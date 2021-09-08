package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chapter14/LoginProc.do")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqProc(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqProc(request, response);
	}
	
	public void reqProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		System.out.println("id="+id);
		System.out.println("pw="+pw);
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		//LoginProc.jsp
		RequestDispatcher rd=request.getRequestDispatcher("LoginProc.jsp");
		
		rd.forward(request, response);
	}
}
//Redirect 방식 -> sendRedirect(); 기존 data는 하나도 가져갈 수 없다.
