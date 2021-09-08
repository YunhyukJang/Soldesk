<%@page import="model.BookDBBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h2>마당서점 도서목록</h2>
		
		<% 
		BookDAO bDAO=new BookDAO();
		
		Vector<BookDBBean> v=bDAO.allSelectBook();
		%>
		
		<table width="1000" border="1">
			<tr>
				<td width="120" align="center">
					도서 ID
				</td>
				
				<td width="120" align="center">
					도서명
				</td>
				
				<td width="120" align="center">
					출판사
				</td>
				
				<td width="120" align="center">
					판매가
				</td>
			</tr>
			
			<% 
			for(int i=0; i<v.size(); i++){
				BookDBBean bean=v.get(i);
			%>
			
			<tr height="40">
				<td width="120" align="center">
					<a href="BookInfo.jsp?bookID=<%= bean.getBookID() %>">
						<%= bean.getBookID() %>
					</a>
				</td>
				
				<td width="120" align="center">
					<%= bean.getBookName() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getPublisher() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getPrice() %>
				</td>
			</tr>
			
			<% 
			}
			%>
		</table>
	</center>
</body>
</html>