<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<hr>
<span class="h_line"></span>

<div class ="container-sm">
	<form>
		<div class ="btn_bbs">
			<button type="button" class="btn btn-outline-success btn-sm" onclick="insert_bbsmove()">게시글작성</button>
		</div>
		<table class="table table-hover" >
			<colgroup>
				<col width = "10%">
				<col width = "60%">
				<col width = "15%">
				<col width = "15%">
			</colgroup>
			<thead class="table-success">
				<tr>
					<th>번호</th>
					<th class="bbs_text">제목</th>
					<th>ID</th>
					<th>작성일</th>	
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty List }">
					<tr>
						<td colspan="4">저장된 데이터가 없습니다.</td>
					</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="view" items="${List}">
							<tr>
								<td>${view.q_idx }</td>
								<c:if test="${view.sec ==1}">
								<td><a href="/Pension/moveContoller?cmd=view_seq&q_idx=${view.q_idx }">🔒${view.title }</a></td>
								</c:if>
								<c:if test="${view.sec ==0}">
								<td><a href="/Pension/bbsContoller?cmd=view&q_idx=${view.q_idx }">${view.title }</a></td>
								</c:if>
								<td>${view.id }</td>
								<td>${view.reg_date }</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</form>
</div>

</body>
<script type="text/javascript" src="js/q_bbs.js"></script>
</html>
