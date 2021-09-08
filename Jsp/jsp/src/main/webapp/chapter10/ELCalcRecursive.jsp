<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Calc Recursive</title>
</head>
<body>
	<center>
		<h2>계산기</h2>
		
		<form action="ELCalcRecursive.jsp" method="POST">
			<table>
				<tr>
					<td>
						<input type="text" name="num1" width="200" size="5" value="${param.num1}"/>
					</td>
					
					<td>
						<select name="operator">
							<option selected>+</option>
							<option>-</option>
							<option>*</option>
							<option>/</option>
						</select>
					</td>
						
					<td>
						<input type="text" name="num2" width="200" size="5" value="${param.num2}"/>
					</td>
					
					<td>
						=
					</td>
						
					<td>
						<% 
						String operator=request.getParameter("operator");
						
						if(operator == null){
							operator="+";
						}
						
						if(operator.equals("+")){
						%>
							
							<input type="text" value="${param.num1+param.num2}"/>
							
						<% 
						}else if(operator.equals("-")){
						%>
							
							<input type="text" value="${param.num1-param.num2}"/>
						
						<% 
						}else if(operator.equals("*")){
						%>
						
							<input type="text" value="${param.num1*param.num2}"/>
						
						<% 
						}else if(operator.equals("/")){
						%>
						
							<input type="text" value="${param.num1/param.num2}"/>
							
						<% 
						}
						%>
					</td>
					
					<td>	
						<input type="submit" value="="/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>