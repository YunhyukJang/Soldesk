<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<div align="center">
		<h2>상품 목록</h2>
		<hr />
		
		<form action="ProductSel.jsp" method="POST">
			<jsp:useBean id="product" class="jspbook.ch10.Product" scope="session"/>
			
			<select name="sel">
				<c:forEach var="item" items="${product.productList}">
					<option>${item}</option>
				</c:forEach>
			</select>
			<p/>
			<p/>
			
			<input type="submit" value="선택"/>
		</form>
	</div>
</body>
</html>