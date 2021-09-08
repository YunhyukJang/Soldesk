<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Calc</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	%>
	
	<div align="center">
		<h3>계산기</h3>
		<hr />
		
		<form action="ELCalcProc.jsp" method="POST">
			<input type="text" name="num1" width="200" size="5"/>
			
			<select name="operator">
				<option selected>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select>
			
			<input type="text" name="num2" width="200" size="5"/>
			<p/>
			
			<input type="submit" name="b1" value="="/>
			<input type="reset" name="b2" value="C"/>
		</form>
	</div>
</body>
</html>