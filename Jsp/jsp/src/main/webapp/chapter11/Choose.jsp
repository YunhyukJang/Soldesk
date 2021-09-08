<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Choose</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h3>&lt;c:choose&gt;</h3>
		
		<form>
			<select name="sel">
				<option ${param.sel == 'A'?'selected':''}>A</option>
				<option ${param.sel == 'B'?'selected':''}>B</option>
				<option ${param.sel == 'C'?'selected':''}>C</option>
				<option ${param.sel == 'D'?'selected':''}>D</option>
				<option ${param.sel == 'E'?'selected':''}>E</option>
			</select>
			<p/>
			<p/>
			
			<input type="submit" value="선택"/>
			<hr />
			
			<c:choose>
				<c:when test="${param.sel == 'A'}">Choose A</c:when>
				<c:when test="${param.sel == 'B'}">Choose B</c:when>
				<c:when test="${param.sel == 'C'}">Choose C</c:when>
				
				<c:otherwise>Choose another</c:otherwise>
			</c:choose>
		</form>
	</center>
</body>
</html>