<%@page import="jspbook.ch07.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="am" class="jspbook.ch07.AddrManager" scope="application"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Addr List</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>
<body>
	<center>
		<h2>주소록</h2>
		<hr />
		
		<a href="AddrForm.jsp">추가 등록</a>
		<p/>
		
		<form action="SName.jsp" method="POST">
			<input type="text" name="sname"> &nbsp;
				<input type="submit" value="검색"/>
			</input>
		</form>
		<p/>
		
		<table border="1" width="500">
			<tr>
				<td>이름</td>
				<td>전화번호</td>
				<td>이메일</td>
				<td>성별</td>
			</tr>
			
			<% 
			for(AddrBean ab:am.getAddrList()){
			%>
				
			<tr>
				<td><%= ab.getName() %></td>
				<td><%= ab.getTel() %></td>
				<td><%= ab.getEmail() %></td>
				<td><%= ab.getGender() %></td>
			</tr>
			
			<% 
			}
			%>
		</table>
	</center>
</body>
</html>