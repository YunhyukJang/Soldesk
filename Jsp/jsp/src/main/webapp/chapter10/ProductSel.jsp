<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Sel</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	%>

	1. 선택한 상품 -> ${param.sel} <br />
	2. num2+num5=${product.num2+product.num5}
</body>
</html>