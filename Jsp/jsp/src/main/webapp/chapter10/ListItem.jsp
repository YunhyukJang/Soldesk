<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mytag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Item</title>
</head>
<body>
	<div align="center">
		<h2>Custom tag test</h2>
		<hr />
		
		<mytag:item width="150" border="1" bgcolor="yellow">재고 현황</mytag:item>
	</div>
</body>
</html>