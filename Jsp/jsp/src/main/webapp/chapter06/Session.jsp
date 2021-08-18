<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body>
	<div align="center">
		<h2>Session test</h2>
		<hr />
		
		<% 
		//isNew() 메서드를 활용하여 최초 세션 설정을 확인
		if(session.isNew()){
			out.println("<script>alert('세션이 해제되어 다시 설정합니다.')</script>");
			
			session.setAttribute("login", "김연아");
		}
		%>
		
		<%= session.getAttribute("login") %> 님 환영합니다. <br />
		
		1. Session ID -> <%= session.getId() %> <br />
		
		<!-- Session 유지 시간 설정(초 단위) -->
		<% session.setMaxInactiveInterval(5); %>
		
		2. Session 유지 시간 -> <%= session.getMaxInactiveInterval() %> sec
	</div>
</body>
</html>