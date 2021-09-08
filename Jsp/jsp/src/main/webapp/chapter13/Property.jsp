<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Property</title>
</head>
<body>
	<div align="center">
		<h2>Property workspace</h2>
		<hr />
		
		<h3>Servlet 설정값 출력</h3>
		
		name3 -> <%= getServletContext().getInitParameter("name3") %> <br />
		workspace -> <%= getServletContext().getInitParameter("workspace") %>
	</div>
</body>
</html>