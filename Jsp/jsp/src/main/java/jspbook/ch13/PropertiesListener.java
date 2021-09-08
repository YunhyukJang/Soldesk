package jspbook.ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PropertiesListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce)  {
		ServletContext ctx=sce.getServletContext();
		
		//초기화 parameter(getInitParameter)로 경로 정보를 가져옴
		String file=ctx.getInitParameter("propfile");
		
		Properties p=new Properties();
		
		try {
			p.load(new FileInputStream(file));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		ctx.setAttribute("prop", p);
    }
	
    public void contextDestroyed(ServletContextEvent sce)  {
    }
}
