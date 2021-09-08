<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- usebean 선언 -->
<!-- id=java에서의 인스턴스 변수(객체), class="package 경로", 
scope="적용 범위(page, request, session, application)" -->
<jsp:useBean id="loginbean" class="jspbook.ch07.LoginBean" scope="page">
	<!-- loginbean 객체를 활용하여 모든 속성을 set -->
	<jsp:setProperty property="*" name="loginbean"/>
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<hr />
		
		<% 
		if(!loginbean.checkUser()){
			out.println("아이디 또는 비밀번호가 맞지 않습니다.");
		}else{
			out.println("로그인되었습니다.");
		}
		%>
		<hr />
		
		<!-- loginbean 객체를 활용하여 모든 속성을 get -->
		아이디 <jsp:getProperty property="id" name="loginbean"/> <br />
		비밀번호 <jsp:getProperty property="pw" name="loginbean"/>
	</div>
</body>
</html>