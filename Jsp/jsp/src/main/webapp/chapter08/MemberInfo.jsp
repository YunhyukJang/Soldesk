<%@page import="model.MemberDBBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Info</title>

<!-- Bootstrap CDN -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous" />

</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	String id=request.getParameter("id");
	
	MemberDAO mDAO=new MemberDAO();
	
	MemberDBBean bean=mDAO.selectMember(id);
	%>
	
	<!-- <table>을 이용해서 화면에 data를 출력하는 구현부 -->
	<center>
		<h2>회원 상세정보</h2>
		
		<table width="600" border="1" cellpadding="1" cellspacing="1">
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">아이디</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getId() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">이메일</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getEmail() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">성별</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getGender() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">주소</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getAddress() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">전화번호</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getPhone() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">관심분야</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getHobby() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">직업</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getJob() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">나이</td>
				<td width="400" bgcolor="moccasin">
					<%= bean.getAge() %>
				</td>
			</tr>
			
			<tr height="40">
				<td width="200" align="center" bgcolor="powderblue">하고 싶은 말</td>
				<td width="400" bgcolor="moccasin">
					<textarea rows="5" cols="40"><%= bean.getInfo() %></textarea>
				</td>
			</tr>
			
			<tr height="40">
				<td width="600" colspan="2" align="center" bgcolor="powderblue">
					<input type="button" value="수정" onclick="location.href='MemberUpdate.jsp?id=<%= bean.getId() %>'"/>
					<input type="button" value="삭제" onclick="location.href='MemberDelete.jsp?id=<%= bean.getId() %>'"/>
					<input type="button" value="전체 회원 목록" onclick="location.href='MemberList.jsp'"/>
					<input type="button" value="회원 가입" onclick="location.href='MemberDBForm.jsp'"/>				
				</td>
			</tr>
		</table>
	</center>
</body>
</html>