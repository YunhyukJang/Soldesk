<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2</title>
</head>
<body>
	<h1>Test2</h1>
	
	<form:form modelAttribute="userDataBean" action="Result">
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
<%-- path=id와 name의 속성값이 혼합된 것
<form:password>는 노출되지 않으므로 showPassword="true"를 선언 --%>