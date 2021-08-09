<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Param</title>
</head>
<body>
	<!-- JSP에서 Java code -->
	<%
	String strName=request.getParameter("name");
	String strMajor=request.getParameter("major");
	
	out.println("name:"+strName+"<br/>");
	out.println("major:"+strMajor+"<hr/>");
	%>
</body>
</html>