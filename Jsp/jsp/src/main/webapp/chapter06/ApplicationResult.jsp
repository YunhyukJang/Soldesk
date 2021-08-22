<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application Result</title>
</head>
<body>
	<div align="center">
		<h2>Application test</h2>
		<hr />
		
		username에 설정된 값 -> <%= application.getAttribute("username") %> <br />
		
		<% 
		Integer count=(Integer)application.getAttribute("count");
		int countP=count.intValue()+1;
		
		application.setAttribute("count", countP);
		%>
		
		count에 설정된 값 -> <%= count %>
	</div>
</body>
</html>