<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test4</title>
</head>
<body>
	<h1>Test4</h1>
	
	<h3>data1=${requestScope.data1}</h3>
	<h3>data2=${requestScope.data2}</h3>

</body>
</html>
<!-- ModelAndView로 받았으나 HttpServletRequest 영역에 담기므로 requestScope로 받는다. -->