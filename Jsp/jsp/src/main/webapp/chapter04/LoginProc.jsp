<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Login Proc</title>
</head>
<body>
	<% 
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	%>
	
	아이디는 <%= id %>, 비밀번호는 <%= pw %> 입니다.
</body>
</html>