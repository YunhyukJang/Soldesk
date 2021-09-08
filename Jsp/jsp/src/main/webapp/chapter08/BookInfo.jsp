<%@page import="model.BookDBBean"%>
<%@page import="model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Info</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	String bookID=request.getParameter("bookID");
	
	BookDAO bDAO=new BookDAO();
	
	BookDBBean bBean=bDAO.selectBook(bookID);
	%>
	
	<center>
		<h2>도서 상세정보</h2>
		
		<table width="600" border="1" cellpadding="1" cellspacing="1">
			<tr height="40">
				<td width="200" align="center">도서 ID</td>
				<td width="400" align="center">
					<%= bBean.getBookID() %>
				</td>
			</tr>
				
			<tr height="40">
				<td width="200" align="center">도서명</td>
				<td width="400" align="center">
					<%= bBean.getBookName() %>
				</td>
			</tr>
				
			<tr height="40">
				<td width="200" align="center">출판사</td>
				<td width="400" align="center">
					<%= bBean.getPublisher() %>
				</td>
			</tr>
				
			<tr height="40">
				<td width="200" align="center">판매가</td>
				<td width="400" align="center">
					<%= bBean.getPrice() %>
				</td>
			</tr>
		</table>
		
		<a href="BookList.jsp">전체 목록</a>
	</center>
</body>
</html>