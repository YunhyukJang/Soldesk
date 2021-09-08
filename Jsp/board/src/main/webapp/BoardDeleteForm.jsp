<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Delete Form</title>

<!-- Bootstrap -->
<link href="./bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<center>
		<h2>게시글 삭제</h2>
		
		<form action="BoardDeleteProcCon.do" method="POST">
			<table width="600" border="1" bgcolor="ivory">
				<tr height="40">
					<td width="150" align="center">비밀번호</td>
					<td width="450" colspan="3">
						&nbsp;<input type="password" name="password" size="60" style="border:none; background:transparent;"/>
					</td>
				</tr>
				
				<tr height="40">
					<td colspan="4" align="center">
						<input type="hidden" name="num" value="${bean.num}"/>
						<input type="hidden" name="pass" value="${bean.password}"/>
						
						<input type="submit" value="삭제"/>&nbsp;&nbsp;
						<input type="button" onclick="location.href='BoardListCon.do'" value="리스트 보기"/>
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>