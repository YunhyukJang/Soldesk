<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member Join Proc</title>
</head>
<body>
	<div align="center">
		<h2>회원 가입</h2>
		
		<% 
		//POST 방식 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		//데이터 가져오기
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String pwCheck=request.getParameter("pwcheck");
		
		if(!pw.equals(pwCheck)){
		%>
		
		<script type="text/javascript">
			alert("비밀번호가 일치하지 않습니다.");
			
			history.go(-1); //이전 페이지로 이동
		</script>
		
		<% 
		}
		
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String tel=request.getParameter("tel");
		
		//[] 타입으로 return
		String interest[]=request.getParameterValues("interest");
		
		String job=request.getParameter("job");
		String age=request.getParameter("age");
		String say=request.getParameter("say");
		%>
		
		<table width="600" border="1">
			<tr height="40">
				<td width="200" align="center">아이디</td>
				<td width="400" align="center">
					<%= id %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">비밀번호</td>
				<td width="400" align="center">
					<%= pw %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">비밀번호 확인</td>
				<td width="400" align="center">
					<%= pwCheck %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">이메일</td>
				<td width="400" align="center">
					<%= email %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">성별</td>
				<td width="400" align="center">
					<%= gender %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">주소</td>
				<td width="400" align="center">
					<%= address %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">전화번호</td>
				<td width="400" align="center">
					<%= tel %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">관심분야</td>
				<td width="400" align="center">
					<% 
					for(String inter:interest){
						out.println(inter+"<br/>");
					}
					%>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">직업</td>
				<td width="400" align="center">
					<%= job %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">나이</td>
				<td width="400" align="center">
					<%= age %>
				</td>			
			</tr>
			
			<tr height="40">
				<td width="200" align="center">하고 싶은 말</td>
				<td width="400" align="center">
					<%= say %>
				</td>			
			</tr>
		</table>
	</div>
</body>
</html>