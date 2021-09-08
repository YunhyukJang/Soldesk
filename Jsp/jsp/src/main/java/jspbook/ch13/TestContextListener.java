package jspbook.ch13;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce)  {
		Book myBook=new Book("자바 프로그래밍", "Mr.Sol", 25000, "솔데스크");
		
		ServletContext ctx=sce.getServletContext();
		
		ctx.setAttribute("book", myBook);
		
		System.out.println("TestContextListener start");
	}
	
    public void contextDestroyed(ServletContextEvent sce)  { 
    }
}
