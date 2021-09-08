<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Test</title>
</head>
<body>
	<h3>Scriptlet tag</h3>
	
	<% 
	int a=3;
	
	out.println("a="+a);
	
	request.setAttribute("b", "3");
	request.setAttribute("hi", "5");
	%>
	<hr />
	
	<h3>Script tag 표현식</h3>
	
	a=<%= a %> <br />
	a=<%= a>4 %> <br />
	a=<%= 3+"4" %> <br /> <!-- 문자 데이터로 연산 시 문자 타입으로 자동 변환 -->
	<%-- b=<%= b %> 파람으로 가져온 값 또는 정의된 값은 사용할 수 없다. --%>
	<hr />
	
	<h3>El tag</h3>
	
	1. a=${a} <br /> <!-- 일반변수 선언은 받을 수 없다. -->
	2. b=${b} <br />
	3. hi=${hi>4} <br /> <!-- 숫자와 문자의 연산도 가능 -->
	4. b=${b+4}
</body>
</html>