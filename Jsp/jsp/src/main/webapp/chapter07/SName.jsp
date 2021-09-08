<%@page import="jspbook.ch07.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="am" class="jspbook.ch07.AddrManager" scope="application"/>

<% 
request.setCharacterEncoding("UTF-8");

AddrBean addr=am.getAddr(request.getParameter("sname"));
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>S Name</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>
<body>
	<div align="center">
		<h2>검색 결과</h2>
		<br />
		
		이름 <%= addr.getName() %> <br />
		전화번호 <%= addr.getTel() %> <br />
		이메일 <%= addr.getEmail() %> <br />
		성별 <%= addr.getGender() %> <br />
		<br />
		
		<a href="AddrList.jsp">전체 주소록 보기</a>
	</div>
</body>
</html>