package kr.co.softsoldesk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.softsoldesk.model.Test2Service;

@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HomeController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("HomeController");
		
		String uri=request.getRequestURI();
		
		//System.out.println(uri);
		
		String viewName=null;
		
		if(uri.contains("Main.mvc")) {
			//System.out.println("Main 요청");
			
			viewName="Main.jsp";
		}else if(uri.contains("Test1.mvc")) {
			//System.out.println("Test1 요청");
			
			String str1=request.getParameter("data1");
			String str2=request.getParameter("data2");
			
			int num1=Integer.parseInt(request.getParameter("data1"));
			int num2=Integer.parseInt(request.getParameter("data2"));
			int result=num1+num2;
			
			request.setAttribute("result", result);
			
			viewName="Test1.jsp";
		}else if(uri.contains("Test2.mvc")) {
			//System.out.println("Test2 요청");
			
			//Model 별도 요청
			int result=Test2Service.minus(request);
			
			request.setAttribute("result", result);
			
			viewName="Test2.jsp";
		}
		
		RequestDispatcher dis=request.getRequestDispatcher(viewName);
		
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
