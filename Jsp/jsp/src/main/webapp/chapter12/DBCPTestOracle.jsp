<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DBCP Test Oracle</title>
</head>
<body>
	<sql:query var="rs" dataSource="jdbc/xe">
		Select name, email from jdbc_test
	</sql:query>
	
	<center>
		<h2>결과 출력</h2>
		<hr />
		
		<c:forEach var="row" items="${rs.rows}">
			이름 -> ${row.name} <br />
			이메일 -> ${row.email } <br />
			<p/>
		</c:forEach>
	</center>
</body>
</html>