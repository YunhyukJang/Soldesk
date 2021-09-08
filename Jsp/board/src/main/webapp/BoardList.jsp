<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board List</title>

<!-- Bootstrap -->
<link href="./bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<c:if test="${msg == 0}">
		<script type="text/javascript">
			alert("비밀번호가 일치하지 않습니다.");
			
			history.go(-1);
		</script>
	</c:if>
	
	<c:if test="${msg == 1}">
		<script type="text/javascript">
			alert("비밀번호가 일치하지 않습니다.");
			
			history.go(-1);
		</script>
	</c:if>

	<center>
		<h2>전체 게시글 보기</h2>
		
		<table width="700" border="1" bordercolor="skyblue">
			<tr height="40">
				<td colspan="5" align="right">
					<button onclick="location.href='BoardWriteForm.jsp'">글쓰기</button>
				</td>
			</tr>
			
			<tr height="40">
				<td width="20" align="center">번호</td>
				<td width="120" align="center">제목</td>
				<td width="70" align="center">작성자</td>
				<td width="20" align="center">작성일</td>
				<td width="20" align="center">조회수</td>
			</tr>
			
			<c:set var="number" value="${number}"/>
			
			<!-- Vector에 있는 모든 list 가져오기 -->
			<c:forEach var="bean" items="${v}">
				<tr height="40">
					<td width="20" align="left">${number}</td>
					
					<td width="120" align="left">
						<!-- 댓글에서 들여쓰기 *첫 번째 메인 글은 들여쓰기가 필요없으므로 두 번째부터 들여쓰기 시작 -->
						<c:if test="${bean.re_step>1}">
							<!-- 들여쓰기 -->
							<c:forEach var="j" begin="1" end="${(bean.re_step-1)*5}">&nbsp;</c:forEach>
						</c:if>
						
						<a href="BoardInfoControl.do?num=${bean.num}" style='text-decoration:none'>${bean.subject}</a>
					</td>
					
					<td width="70" align="center">${bean.writer}</td>
					<td width="20" align="center">${bean.reg_date}</td>
					<td width="20" align="center">${bean.readcount}</td>
				</tr>
				
				<!-- 글 count를 최신 글로 하나씩 감소 -->
				<c:set var="number" value="${number-1}"/>
			</c:forEach>
		</table>
		<p/>
		
		<!-- Page 카운터링 source 구현 -->
		<!-- 전체 글 10 -> 10/10=1 *나눠 떨어지면 증가값 없음
		전체 글 34 -> 34/10=3+1 *나눠 떨어지지 않으면 증가값 1 -->
		<c:set var="pageCount" value="${count/pageSize+(count%pageSize == 0?0:1)}"/>
		<!-- Start page 숫자 지정 -->
		<c:set var="startPage" value="${1}"/>
		
		<c:if test="${currentPage%10 != 0}">
			<fmt:parseNumber var="result" value="${currentPage/10}" integerOnly="true"/>
			
			<c:set var="startPage" value="${result*10+1}"/>
		</c:if>
		
		<!-- 화면에 보여지는 page 처리 숫자 구현 -->
		<c:set var="pageBlock" value="${10}"/>
		<!-- 첫 번째 pageBlock의 경우 -> 1+10-1=10 -->
		<c:set var="endPage" value="${startPage+pageBlock-1}"/>
		
		<c:if test="${endPage>pageCount}">
			<c:set var="endPage" value="${pageCount}"/>
		</c:if>
		
		<!-- 이전 link page -->
		<c:if test="${startPage>10}">
			<a href="BoardListCon.do?pageNum=${startPage-10}" style='text-decoration:none'>[이전 페이지]</a>
		</c:if>
		
		<!-- 페이징 처리 -->
		<c:forEach var="i" begin="${startPage}" end="${endPage}">
			<a href="BoardListCon.do?pageNum=${i}" style='text-decoration:none'>[${i}]&nbsp;</a>
		</c:forEach>
		
		<!-- 이후 link page -->
		<c:if test="${endPage<pageCount}">
			<a href="BoardListCon.do?pageNum=${startPage+10}" style='text-decoration:none'>[다음 페이지]</a>
		</c:if>
	</center>
</body>
</html>