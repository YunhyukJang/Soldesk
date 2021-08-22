<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sel Product</title>

<% 
request.setCharacterEncoding("UTF-8");

session.setAttribute("username", request.getParameter("username"));
%>

</head>
<body>
	<div align="center">
		<h2>상품 선택</h2>
		<hr />
		
		<%= session.getAttribute("username") %> 님 환영합니다.
		<p/>
		
		<form action="Add.jsp" method="POST" name="form1">
			<select name="product">
				<option>사과</option>
				<option>딸기</option>
				<option>포도</option>
				<option>바나나</option>
				<option>오렌지</option>
			</select>
			
			<input type="submit" value="담기"/>
		</form>
		<p/>
		
		<a href="CheckOut.jsp">계산</a>
	</div>
</body>
</html>