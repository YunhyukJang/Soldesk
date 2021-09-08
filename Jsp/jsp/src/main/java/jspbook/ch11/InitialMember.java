package jspbook.ch11;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitialMember implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext context=sce.getServletContext();
    	
    	ArrayList<Member> data=new ArrayList<Member>();
    	
    	for(int i=0; i<8; i++) {
    		Member mData=new Member("tester"+i, "tester"+i+"@test.com");
    		
    		data.add(mData);
    	}
    	
    	//email이 없는 회원 2명
    	data.add(new Member("박보영", null));
    	data.add(new Member("서현진", null));
    	
    	//application scope에 저장
    	context.setAttribute("members", data);
    	context.setAttribute("member", new Member()); //name="김연아", email="yuna@gmail.com"
    }
    
    public void contextDestroyed(ServletContextEvent sce)  {
    }
}

/*
 * @WebListener 어노테이션은 servlet-api library를 가져와서 사용할 수 있도록 구현. Web application의
 * event 즉 시작, 종료 등의 event를 담당하는 listener. Member class가 호출되는 순간 자동으로 객체처럼
 * compile되어 실행된다.
 */