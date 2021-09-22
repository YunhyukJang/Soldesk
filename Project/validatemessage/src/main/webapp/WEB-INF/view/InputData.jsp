<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Data</title>
</head>
<body>
	<h1>Input data</h1>
	
	<%-- <form action="InputPro" method="POST">
		data1 <input type="text" name="data1"/> <br />
		
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('data1')}">
				//${errors.getFieldError('data1').defaultMessage} <br />
				<spring:message code="${errors.getFieldError('data1').codes[0]}"/> <br />
			</c:if>
		</spring:hasBindErrors>
		
		data2 <input type="text" name="data2"/> <br />
		
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('data2')}">
				//${errors.getFieldError('data2').defaultMessage} <br />
				<spring:message code="${errors.getFieldError('data2').codes[0]}"/> <br />
			</c:if>
		</spring:hasBindErrors>
		
		<button type="submit">확인</button>
	</form> --%>
	
	<form:form action="InputPro" method="POST" modelAttribute="dataBean1">
		data1 <form:input type="text" path="data1"/> <br />
		
		<form:errors path="data1"/> <br />
		
		data2 <form:input type="text" path="data2"/> <br />
		
		<form:errors path="data2"/> <br />
		
		<form:button type="submit">확인</form:button>
	</form:form>
</body>
</html>