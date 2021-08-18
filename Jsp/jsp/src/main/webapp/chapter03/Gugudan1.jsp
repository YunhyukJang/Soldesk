<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan1</title>
</head>
<body>
	<!-- 콘솔 출력 -->
	<% 
	for(int i=1; i<10; i++){
		for(int j=1; j<10; j++){
			System.out.println(i+"*"+j+"="+i*j);
		}
		
		System.out.println();
	}
	%>
	
	<% 
	for(int i=1; i<10; i++){
		for(int j=1; j<10; j++){
	%>
	
	<%= i %> * <%= j %> = <%= i*j %> &nbsp; &nbsp;
	
	<% 
	}
	%>
	<p/>
	
	<% 
	}
	%>
</body>
</html>