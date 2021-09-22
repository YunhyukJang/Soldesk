<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test4</title>
</head>
<body>
	<h1>Test4</h1>
	
	<form:form modelAttribute="testBean2" action="Result">
		이름 <form:input path="userName"/> <br />
		아이디 <form:input path="userID"/> <br />
		비밀번호 <form:password path="userPw" showPassword="true"/> <br />
		우편번호 <form:input path="userPostCode"/> <br />
		주소 1 <form:input path="userAddress1"/> <br />
		주소 2 <form:input path="userAddress2"/> <br />
		
		<button type="submit">확인</button>
	</form:form>
</body>
</html>