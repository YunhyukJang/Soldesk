package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chapter14/HelloWorld")
public class HelloWorld extends HttpServlet {
	//직렬화
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
	}
	
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String msg="Hello World";
		Integer data=8;
		
		req.setAttribute("msg", msg);
		req.setAttribute("data", data);
		
		//Servlet에서 JSP를 호출하면서 data를 같이 넘겨주는 객체를 선언
		RequestDispatcher rd=req.getRequestDispatcher("HelloWorld.jsp");
		
		rd.forward(req, res);
	}
}
