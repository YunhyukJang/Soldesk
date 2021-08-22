<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application</title>
</head>
<body>
	<div align="center">
		<h2>Application</h2>
		<hr />
		
		1. Server 정보 -> <%= application.getServerInfo() %> <br />
		2. Servlet API version 정보 -> <%= application.getMajorVersion()
		+"."+application.getMinorVersion() %> <br />
		3. Application.jsp 파일 경로 -> <%= application.getRealPath("Application.jsp") %>
		<hr />
		
		<% 
		application.setAttribute("username", "admin");
		application.log("username=admin"); //콘솔 출력
		application.setAttribute("count", 0);
		%>
		
		<a href="ApplicationResult.jsp">확인</a>
	</div>
</body>
</html>