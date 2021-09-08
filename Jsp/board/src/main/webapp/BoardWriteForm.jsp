<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Write Form</title>

<!-- Bootstrap -->
<link href="./bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<center>
		<h2>글쓰기</h2>
		
		<form action="BoardWriteProcCon.do" method="POST">
			<table width="600" border="1" bordercolor="gray" bgcolor="ivory">
				<tr height="40">
					<td width="200" align="center">작성자</td>
					<td width="400">
						<input type="text" name="writer" size="30" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">제목</td>
					<td width="400">
						<input type="text" name="subject" value="[답변]" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">이메일</td>
					<td width="400">
						<input type="email" name="email" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">비밀번호</td>
					<td width="400">
						<input type="password" name="password" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td width="200" align="center">글 내용</td>
					<td width="400">
						<textarea rows="10" cols="50" name="contents" style="border:none; background:transparent;"></textarea>
					</td>
				</tr>
				
				<tr height="40">
					<td colspan="2" align="center">
						<input type="submit" value="작성"/>&nbsp;&nbsp;
						<input type="reset" value="초기화"/>&nbsp;&nbsp;
						
						<button onclick="location.href='BoardListCon.do'">리스트 보기</button>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>