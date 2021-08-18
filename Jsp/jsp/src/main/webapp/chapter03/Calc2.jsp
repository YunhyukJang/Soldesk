<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- CalcBean calc=new CalcBean();과 같은 코드로 인스턴스 생성 -->
<jsp:useBean id="calc" class="jspbook.ch03.CalcBean"/>

<!-- calc 객체의 setter 메서드 호출을 html의 <form>에 적용 -->
<jsp:setProperty name="calc" property="*"/>

<% calc.calculator(); %>

<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<div align="center">
		<h3>계산기</h3>
		<hr />
		
		<form name="form1" method="POST">
			<input type="text" name="num1" width="200" size="5" />
			
			<select name="operator">
				<option selected>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select>
			
			<input type="text" name="num2" width="200" size="5" />
			
			<input type="submit" value="계산" name="b1" />
			<input type="reset" value="초기화" name="b2" />
		</form>
		<hr />
		
		결과=<jsp:getProperty name="calc" property="result"/>
	</div>
</body>
</html>