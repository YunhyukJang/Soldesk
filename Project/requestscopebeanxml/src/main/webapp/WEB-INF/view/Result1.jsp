<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result1</title>
</head>
<body>
	<h1>Result1</h1>
	
	<h3>data1 -> ${requestScope.requestBean1.data1}</h3>
	<h3>data2 -> ${requestScope.requestBean1.data2}</h3>
	
	<h3>data3 -> ${requestScope.requestBean2.data3}</h3>
	<h3>data4 -> ${requestScope.requestBean2.data4}</h3>
	
	<h3>data5 -> ${requestScope.requestBean3.data5}</h3>
	<h3>data6 -> ${requestScope.requestBean3.data6}</h3>
	
	<h3>data7 -> ${requestScope.requestBean4.data7}</h3>
	<h3>data8 -> ${requestScope.requestBean4.data8}</h3>
</body>
</html>