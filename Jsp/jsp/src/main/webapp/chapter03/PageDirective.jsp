<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="404-Error.jsp" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
	Error page <br/>
	
	<% int res=10/0; %> <p/>
	
	<a href="Error.jsp">이전 페이지</a>
</body>
</html>