<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Import</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h3>&lt;c:import&gt;</h3>
		
		다음은 import를 이용해 포함한 것입니다.
		<hr />
		
		<c:import url="Set.jsp" var="myurl"/>
		
		<c:out value="${myurl}" escapeXml="false"/>
		<hr />
		
		<h3>import -> www.daum.net</h3>
		
		<c:import url="https://www.daum.net/" var="myurl2"/>
		
		<c:out value="${myurl2}" escapeXml="false"/>
	</center>
</body>
</html>