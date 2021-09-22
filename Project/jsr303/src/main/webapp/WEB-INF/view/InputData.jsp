<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Data</title>
</head>
<body>
	<h1>Input data</h1>
	
	<form:form action="InputPro" method="POST" modelAttribute="dataBean1">
		data1 <form:radiobutton path="data1" value="true"/>동의
		<form:radiobutton path="data1" value="false"/>동의하지 않음 <br />
		<form:errors path="data1"/> <br />
		
		data2 <form:radiobutton path="data2" value="true"/>동의
		<form:radiobutton path="data2" value="false"/>동의하지 않음 <br />
		<form:errors path="data2"/> <br />
		
		data3 <form:input path="data3"/> <br />
		<form:errors path="data3"/> <br />
		
		data4 <form:input path="data4"/> <br />
		<form:errors path="data4"/> <br />
		
		data5 <form:checkbox path="data5" value="check1"/> 전과 기록 <br />
		<form:errors path="data5"></form:errors> <br />
		
		data6 <form:checkbox path="data6" value="check2"/> 필수 선택 <br />
		<form:errors path="data6"></form:errors> <br />
		
		data7 <form:input path="data7"/> <br />
		<form:errors path="data7"/> <br />
		
		data8 <form:input path="data8"/> <br />
		<form:errors path="data8"/> <br />
		
		data9 <form:input path="data9"/> <br />
		<form:errors path="data9"/> <br />
		
		Email <form:input path="email"/> <br />
		<form:errors path="email"/> <br />
		
		아이디 <form:input path="userID"/> <br />
		<form:errors path="userID"/> <br />
		
		비밀번호 <form:input path="userPw"/> <br />
		<form:errors path="userPw"/> <br />
		
		연락처 <form:input path="phone"/> <br />
		<form:errors path="phone"/> <br />
		
		우편번호 <form:input path="postCode"/> <br />
		<form:errors path="postCode"/> <br />
	
		<form:button type="submit">확인</form:button>
	</form:form>
</body>
</html>