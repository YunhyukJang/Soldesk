<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
request.setCharacterEncoding("UTF-8");

String userName=request.getParameter("username");

if(userName != null){
	session.setAttribute("user", userName);
}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Twitter List</title>
</head>
<body>
	<div align="center">
		<h2>My simple Twitter</h2>
		<hr />
		
		<form action="Twit.jsp" method="POST">
			<%= session.getAttribute("user") %>
			
			<input type="text" name="message"/>
			
			<input type="submit" value="Twit"/>
		</form>
		<hr />
		
		<div align="left">
			<ul>
				<% 
				//application 내장 객체를 통해 ArrayList에 messages라는 이름으로 객체를 생성하여 댓글을 가져옴.
				ArrayList<String> msgs=(ArrayList)application.getAttribute("messages");
				
				//messageList
				if(msgs != null){
					for(String messages:msgs){
						out.println("<li>"+messages+"</li>");
					}
					
				}
				%>
			</ul>
		</div>
	</div>
</body>
</html>