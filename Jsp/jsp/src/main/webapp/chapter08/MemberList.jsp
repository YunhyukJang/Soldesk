<%@page import="model.MemberDBBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member List</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<center>
		<h2>전체 회원 목록</h2>
		
		<% 
		MemberDAO mDAO=new MemberDAO();
		
		Vector<MemberDBBean> v=mDAO.allSelectMember();
		%>
		
		<table width="1000" border="1">
			<tr>
				<td width="120" align="center">
					아이디
				</td>
				
				<td width="120" align="center">
					이메일
				</td>
				
				<td width="120" align="center">
					주소
				</td>
				
				<td width="120" align="center">
					전화번호
				</td>
				
				<td width="120" align="center">
					취미
				</td>
				
				<td width="120" align="center">
					직업
				</td>
			</tr>
			
			<% 
			for(int i=0; i<v.size(); i++){
				MemberDBBean bean=v.get(i);
			%>
			
			<tr height="40">
				<td width="120" align="center">
					<a href="MemberInfo.jsp?id=<%= bean.getId() %>">
						<%= bean.getId() %>
					</a>
				</td>
				
				<td width="120" align="center">
					<%= bean.getEmail() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getAddress() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getPhone() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getHobby() %>
				</td>
				
				<td width="120" align="center">
					<%= bean.getJob() %>
				</td>
			</tr>
			
			<% 
			}
			%>
		</table>
	</center>
</body>
</html>