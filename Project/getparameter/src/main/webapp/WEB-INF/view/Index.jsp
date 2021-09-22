<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Get parameter</h1>
	
	<a href="Test1?data1=100&data2=200&data3=300&data3=400">Test1 GET</a>
	<hr />
	
	<form action="Test2" method="POST">
		data1=<input type="text" name="data1"/> <br />
		data2=<input type="text" name="data2"/> <br />
		data3=<input type="checkbox" name="data3" value="300"/>300
		<input type="checkbox" name="data3" value="400"/>400
		<br />
		
		<button type="submit">Test2 POST</button>
	</form>
	<hr />
	
	<a href="Test3?data1=100&data2=200&data3=300&data3=400">Test3</a>
	<hr />
	
	<!-- data를 순서로 처리 -->
	<a href="Test4/100/200/300">Test4</a>
	<hr />
	
	<a href="Test5?data1=100&data2=200&data3=300&data3=400">Test5</a>
	<hr />
	
	<a href="Test6?data1=100&data2=200&data3=300&data3=400">Test6</a>
	<hr />
	
	<a href="Test7?data1=100">Test7</a>
</body>
</html>