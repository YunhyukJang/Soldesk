<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Info</title>

<!-- Bootstrap -->
<link href="./bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<center>
		<h2>게시글 보기</h2>
		
		<table width="600" border="1">
			<tr height="40">
				<td width="120" align="center">글번호</td>
				<td width="180" align="left">${bean.num}</td>
				<td width="120" align="center">조회수</td>
				<td width="180" align="left">${bean.readcount}</td>
			</tr>
			
			<tr height="40">
				<td width="120" align="center">작성자</td>
				<td width="180" align="left">${bean.writer}</td>
				<td width="120" align="center">작성일</td>
				<td width="180" align="left">${bean.reg_date}</td>
			</tr>
			
			<tr height="40">
				<td width="120" align="center">이메일</td>
				<td colspan="3" align="left">${bean.email}</td>
			</tr>
			
			<tr height="40">
				<td width="120" align="center">제목</td>
				<td colspan="3" align="left">${bean.subject}</td>
			</tr>
			
			<tr height="40">
				<td width="120" align="center">글 내용</td>
				<td colspan="3" align="left">${bean.contents}</td>
			</tr>
			
			<tr height="40">
				<td colspan="4" align="center">
					<button onclick="location.href='BoardReWriteCon.do?num=${bean.num}&ref=${bean.ref}&re_step=${bean.re_step}&re_level=${bean.re_level}'">답글 작성</button>&nbsp;
					<button onclick="location.href='BoardUpdateCon.do?num=${bean.num}'">글 수정</button>&nbsp;
					<button onclick="location.href='BoardDeleteCon.do?num=${bean.num}'">글 삭제</button>&nbsp;
					<button onclick="location.href='BoardListCon.do'">전체 게시글 보기</button>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>