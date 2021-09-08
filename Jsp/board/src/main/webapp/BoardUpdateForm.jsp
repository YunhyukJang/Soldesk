<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Update Form</title>
</head>
<body>
	<center>
		<h2>게시글 수정</h2>
		
		<form action="BoardUpdateProcCon.do" method="POST">
			<table width="600" border="1">
				<tr height="40">
					<td width="150" align="center">작성자</td>
					<td width="150" align="center">${bean.writer}</td>
					<td width="150" align="center">작성일</td>
					<td width="150" align="center">${bean.reg_date}</td>
				</tr>
				
				<tr height="40">
					<td width="150" align="center">제목</td>
					<td width="450" colspan="3" align="left">
						<input type="text" name="subject" value="${bean.subject}" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="150" align="center">비밀번호</td>
					<td width="450" colspan="3" align="left">
						<input type="password" name="password" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr>
					<td width="150" align="center">내용</td>
					<td width="450" colspan="3" align="left">
						<textarea rows="10" cols="60" name="contents" style="border:none; background:transparent;">${bean.contents}</textarea>
					</td>
				</tr>
				
				<tr height="40">
					<td colspan="4" align="center">
						<input type="hidden" name="num" value="${bean.num}"/>
						<input type="hidden" name="pass" value="${bean.password}"/>
						<input type="submit" value="수정"/>&nbsp;&nbsp;
						<input type="reset" value="초기화"/>&nbsp;&nbsp;
						<input type="button" onclick="location.href='BoardListCon.do'" value="리스트 보기"/>				
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>