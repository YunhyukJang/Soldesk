<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>For</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h3>&lt;c:for&gt;</h3>
		
		<c:forEach var="i" items="${members}" begin="0" varStatus="status" end="5">
			index -> ${status.index} <br />
			count -> ${status.count} <br />
			이름 -> ${i.name} <br />
			이메일 -> ${i.email} <br />
			<br />
		</c:forEach>
		<hr />
		
		<c:forTokens items="김연아, 010-0000-0000, 서울" delims="," var="sel">
			${sel} <br />
		</c:forTokens>
		<hr />
		
		<fmt:formatNumber value="3.141592" pattern="#.00"/>
	</center>
</body>
</html>