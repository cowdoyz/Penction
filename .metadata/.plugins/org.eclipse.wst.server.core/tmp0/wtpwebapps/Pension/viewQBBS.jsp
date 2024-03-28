<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div class="container viewContainer border border-4">
	<span class="h_line"></span>
	<form action="" class="viewQbbsForm ">
		<h2>${qvo.q_idx} 번 글 </h2>
		<table class="table table-success table-striped ">
				<tr>
					<th>ID :</th>
					<td>${qvo.id }</td>
					<th>IP :</th>
					<td>${qvo.ip}</td>
				</tr>
				<tr>
					<th>제목 :</th>
					<td>${qvo.title}</td>
					<th>날짜 :</th>
					<td>${qvo.reg_date }</td>
				</tr>
				<tr>
					<th colspan="4">문의 내용</th>
				</tr>
				<tr height="100px">
					<td colspan="4"><textarea class="form-control" rows="3" readonly="readonly">${qvo.content}</textarea></td>
				</tr>
				<tr>
					<td colspan="4" align="right">
						<input type="button" value="수정"  class="btn btn-outline-success" onclick="">
						<input type="button" value="삭제"  class="btn btn-outline-success" onclick="">
						<input type="button" value="목록으로"  class="btn btn-outline-success" onclick="movebbslist()">
					</td>
				</tr>
		</table>
	</form>
	<form>
		<div class="input-group">
		  <span class="input-group-text">${sessionScope.user }</span>
		  <input type="text" class="form-control">
		  <button class="btn btn-outline-secondary" type="button">댓글달기</button>
		</div>
	</form>
</div>
</body>
<script type="text/javascript" src="js/q_bbs.js"></script>
</html>