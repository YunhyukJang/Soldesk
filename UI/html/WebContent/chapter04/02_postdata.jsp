<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post 방식</title>
</head>
<body>
	<%
	String strName=request.getParameter("name");
	String strMajor=request.getParameter("major");
	
	out.println("이름:"+strName+"<br/>");
	out.println("전공:"+strMajor+"<hr/>");
	%>
</body>
</html>