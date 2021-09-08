package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardUpdateProcCon.do")
public class BoardUpdateProcCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int num=Integer.parseInt(request.getParameter("num"));
		String password=request.getParameter("password"); //사용자가 입력한 비밀번호
		String pass=request.getParameter("pass"); //Oracle DB
		String subject=request.getParameter("subject");
		String contents=request.getParameter("contents");
		
		if(password.equals(pass)) {
			BoardDAO bdao=new BoardDAO();
			
			bdao.UpdateBoard(num, subject, contents);
			
			RequestDispatcher dis=request.getRequestDispatcher("BoardListCon.do");
			
			dis.forward(request, response);
		}else {
			request.setAttribute("msg", "0");
			
			RequestDispatcher dis=request.getRequestDispatcher("BoardListCon.do");
			
			dis.forward(request, response);
		}
		
	}
}
