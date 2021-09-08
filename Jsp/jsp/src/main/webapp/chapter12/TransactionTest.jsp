<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bb1" class="jspbook.ch12.Bank1Bean" scope="page"/>
<jsp:useBean id="bb2" class="jspbook.ch12.Bank2Bean" scope="page"/>

<% 
if(request.getMethod().equals("POST")){
	if(bb1.transfer(Integer.parseInt(request.getParameter("bal")))){
		out.println("<script>alert('정상 처리되었습니다.')</script>");
	}else{
		out.println("<script>alert('한도가 초과되었습니다.')</script>");
	}
	
	bb1.getData();
	bb2.getData();
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Transaction Test</title>
</head>
<body>
	<div align="center">
		<h3>이체 결과</h3>
		
		<table border="1" cellpadding="5" cellspacing="0">
			<tr>
				<td>Bank1</td>
				
				<td>
					이름:<%= bb1.getaName() %>
				</td>
				
				<td>
					잔액:<%= bb1.getBalance() %>
				</td>
			</tr>	
			
			<tr>
				<td>Bank2</td>
				
				<td>
					이름:<%= bb2.getaName() %>
				</td>
				
				<td>
					잔액:<%= bb2.getBalance() %>
				</td>
			</tr>	
		</table>
		<hr />
		
		<form method="POST">
			이체 금액 <input type="text" name="bal" width="200" size="5"/> <br />
			<p/>
			
			<input type="submit" name="b1" value="실행"/>
			<input type="reset" name="b2" value="재입력"/>
		</form>
	</div>
</body>
</html>