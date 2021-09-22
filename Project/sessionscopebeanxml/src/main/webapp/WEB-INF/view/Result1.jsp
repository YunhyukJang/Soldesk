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
	
	<!-- Model 주입 없이 sessionScope로는 출력이 안된다. 즉 응답할 수 없다. -->
	<%-- <h3>sessionBean1.data1 -> ${sessionScope.sessionBean1.data1}</h3>
	<h3>sessionBean1.data2 -> ${sessionScope.sessionBean1.data2}</h3>
	
	<h3>sessionBean2.data3 -> ${sessionScope.sessionBean2.data3}</h3>
	<h3>sessionBean2.data4 -> ${sessionScope.sessionBean2.data4}</h3> --%>
	
	<h3>sessionBean1.data1 -> ${requestScope.sessionBean1.data1}</h3>
	<h3>sessionBean1.data2 -> ${requestScope.sessionBean1.data2}</h3>
	
	<h3>sessionBean2.data3 -> ${requestScope.sessionBean2.data3}</h3>
	<h3>sessionBean2.data4 -> ${requestScope.sessionBean2.data4}</h3>
	
	<h3>sessionBean3.data5 -> ${requestScope.sessionBean3.data5}</h3>
	<h3>sessionBean3.data6 -> ${requestScope.sessionBean3.data6}</h3>
	
	<h3>sessionBean4.data7 -> ${requestScope.sessionBean4.data7}</h3>
	<h3>sessionBean4.data8 -> ${requestScope.sessionBean4.data8}</h3>
</body>
</html>