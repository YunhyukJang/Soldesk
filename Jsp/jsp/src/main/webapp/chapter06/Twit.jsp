<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
request.setCharacterEncoding("UTF-8");

String msg=request.getParameter("message");

//Session에 저장된 사용자 id 가져오기
Object userName=session.getAttribute("user");

ArrayList<String> msgs=(ArrayList<String>)application.getAttribute("messages");

//입력한 댓글 가져오기
if(msgs == null){
	msgs=new ArrayList<String>();
	
	application.setAttribute("messages", msgs);
}

Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("MM/dd (HH:mm)", Locale.KOREA);

msgs.add(userName+" : "+msg+", "+sdf.format(date));

application.log(msg+" <- 메시지가 추가됨.");

response.sendRedirect("TwitterList.jsp");
%>