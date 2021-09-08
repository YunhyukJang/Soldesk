package model;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardListCon.do")
public class BoardListCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//#1 
		//한 page에 보여질 게시글의 갯수를 정함 *10개씩
		int pageSize=10;
		
		//현재 보여지고 있는 page의 number 값을 읽어들임
		String pageNum=request.getParameter("pageNum"); //[1][2][3]...
		
		if(pageNum == null) {
			pageNum="1";
		}
		
		//총 게시글 갯수
		int count=0;
		//화면에 보여지는 글 번호
		int number=0;
		//현재 보여지고 있는 page 번호 형변환
		int currentPage=Integer.parseInt(pageNum);
		
		BoardDAO bdao=new BoardDAO();
		
		//전체 게시글의 갯수를 얻어오는 메서드
		count=bdao.getAllCount();
		
		//#2
		//현재 보여질 page 시작 번호를 설정
		//1 page 경우 (1-1)*10+1=1
		//2 page 경우 (2-1)*10+1=11
		//3 page 경우 (3-1)*10+1=21
		int startRow=(currentPage-1)*pageSize+1;
		
		//1 page 경우 1*10=10
		//2 page 경우 2*10=20
		//3 page 경우 3*10=30
		int endRow=currentPage*pageSize;
		
		//최신 글 10개를 기준으로 게시글을 return 받아주는 메서드 호출
		Vector<BoardBean> v=bdao.getAllBoard(startRow, endRow);
		
		//#3
		//start, end까지의 data만 가져옴
		//전체 글을 9로 봤을 때 9-(1-1)*10=9
		//11번째 글 위치 11-(2-1)*10=1
		//23번째 글 위치 23-(3-1)*10=3
		number=count-(currentPage-1)*pageSize; //글 목록에 표시할 글 번호
		
		String msg=(String)request.getAttribute("msg");
		
		//JSP page에서 사용할 수 있도록 서버에 넘겨줌 *저장
		request.setAttribute("v", v);
		request.setAttribute("number", number);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("count", count);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("msg", msg);
		
		RequestDispatcher dis=request.getRequestDispatcher("BoardList.jsp");
		
		dis.forward(request, response);
	}
}
