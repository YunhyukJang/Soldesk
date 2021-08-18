<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
int result=0;

if(request.getMethod().equals("POST")){
	//연산자 가져오기
	String op=request.getParameter("operator");
	
	//문자열 형태로 전달된 값을 int로 변환
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	
	//계산
	if(op.equals("+")){
		result=num1+num2;
	}else if(op.equals("-")){
		result=num1-num2;
	}else if(op.equals("*")){
		result=num1*num2;
	}else if(op.equals("/")){
		result=num1/num2;
	}
	
}
%>

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
		
		계산 결과=<%= result %>
	</div>
</body>
</html>