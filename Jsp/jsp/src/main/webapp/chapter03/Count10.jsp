<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1~10까지의 숫자 표현</title>
</head>
<body>
	<h2>1~10까지의 숫자 표현</h2>
	
	<% 
	for(int i=1; i <= 10; i++){
		System.out.println(i);
	%>
	
	<%= i %> <br />
	
	<% 
	}
	%>
</body>
</html>