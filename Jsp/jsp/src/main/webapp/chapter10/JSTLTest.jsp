<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL Test</title>
</head>
<body>
	<!-- if문 사용법-EL을 사용하여 조건문 구현 -->
	<c:if test="${4>3}">
		수업 시작! <br />
	</c:if>
	
	<!-- 변수 선언 -->
	<!-- int i=4 -->
	<%-- <% request.setAttribute("i", 4); %> --%>
	<c:set var="i" value="4">
	</c:set>
	<p/>
	
	<c:if test="${i>3}">
		점심시간! <br />
	</c:if>
	<p/>
	
	<!-- 반복문 -->
	<c:forEach var="i" begin="1" end="10">
		<c:set var="sum" value="${sum=sum+i}"/>
	</c:forEach>
	
	sum=${sum} <br />
	<p/>
	
	<!-- 반복문2 -->
	<c:forEach var="j" begin="1" end="10" step="${j+2}">
		<c:set var="sum" value="${sum2=sum2+j}"/>
	</c:forEach>
	
	sum2=${sum2} <br />
</body>
</html>