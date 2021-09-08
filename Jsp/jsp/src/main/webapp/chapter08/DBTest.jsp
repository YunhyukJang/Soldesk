<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB Test</title>
</head>
<body>
	<% 
	//Oracle database 연결 URL 설정
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pw="12341234";
	
	//접속 코드는 네트워크에 문제가 생길 시 설정이 안되므로 반드시 exception 처리
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn=DriverManager.getConnection(url, user, pw);
	}catch(Exception e){
		e.printStackTrace();
	}
	%>
	
	Success!
</body>
</html>