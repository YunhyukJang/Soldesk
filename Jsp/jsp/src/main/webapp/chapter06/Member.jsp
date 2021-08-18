<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>
</head>
<body>
	<div align="center">
		<h2>회원 가입</h2>
		
		<form action="MemberJoinProc.jsp" method="POST">
			<table width="600" border="1">
				<tr height="40">
					<td width="200" align="center">아이디</td>
					<td width="400" align="center">
						<input type="text" name="id"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">비밀번호</td>
					<td width="400" align="center">
						<input type="password" name="pw"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">비밀번호 확인</td>
					<td width="400" align="center">
						<input type="password" name="pwcheck"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">이메일</td>
					<td width="400" align="center">
						<input type="email" name="email"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">성별</td>
					<td width="400" align="center">
						<input type="radio" name="gender" value="남"/>남
						<input type="radio" name="gender" value="여"/>여
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">주소</td>
					<td width="400" align="center">
						<input type="text" name="address"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">전화번호</td>
					<td width="400" align="center">
						<input type="text" name="tel"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">관심분야</td>
					<td width="400" align="center">
						<input type="checkbox" name="interest" value="게임"/>게임
						<input type="checkbox" name="interest" value="음악"/>음악
						<input type="checkbox" name="interest" value="여행"/>여행
						<input type="checkbox" name="interest" value="영화"/>영화
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">직업</td>
					<td width="400" align="center">
						<select name="job">
							<option value="가수" selected>가수</option>
							<option value="교사">교사</option>
							<option value="승무원">승무원</option>
							<option value="의사">의사</option>
						</select>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">나이</td>
					<td width="400" align="center">
						<input type="radio" name="age" value="10대"/>10대
						<input type="radio" name="age" value="20대"/>20대
						<input type="radio" name="age" value="30대"/>30대
						<input type="radio" name="age" value="40대"/>40대
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">하고 싶은 말</td>
					<td width="400" align="center">
						<textarea cols="40" rows="5" name="say"></textarea>
					</td>
				</tr>
				
				<tr height="40">
					<td width="600" colspan="2" align="center">
						<input type="submit" value="회원가입"/>
						<input type="reset" value="초기화"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>