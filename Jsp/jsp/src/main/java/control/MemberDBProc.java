package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chapter14/Proc.do")
public class MemberDBProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqProc(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqProc(request, response);
	}
	
	protected void reqProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		MemberDBBean bean=new MemberDBBean();
		
		bean.setId(request.getParameter("id"));
		
		String pw1=request.getParameter("pw1");
		String pw2=request.getParameter("pw2");
				
		bean.setPw1(pw1);
		bean.setPw1(pw2);
		bean.setEmail(request.getParameter("email"));
		bean.setGender(request.getParameter("gender"));
		bean.setAddress(request.getParameter("address"));
		bean.setPhone(request.getParameter("phone"));
		
		String[] arrHobby=request.getParameterValues("hobby");
		String data="";
		
		for(String hobby:arrHobby) {
			data += hobby+", ";
		}
		
		bean.setHobby(data);
		bean.setJob(request.getParameter("job"));
		bean.setAge(request.getParameter("age"));
		bean.setInfo(request.getParameter("info"));
		
		//비밀번호가 같을 때만 DB에 저장
		if(pw1.equals(pw2)) {
			MemberDAO mDAO=new MemberDAO();
			
			mDAO.insertMember(bean);
			
			RequestDispatcher dis=request.getRequestDispatcher("MemberListCon.do");
			
			dis.forward(request, response);
		}else {
			request.setAttribute("msg", "비밀번호가 일치하지 않습니다.");
			
			RequestDispatcher dis=request.getRequestDispatcher("LoginError.jsp");
			
			dis.forward(request, response);
		}
		
	}
}
