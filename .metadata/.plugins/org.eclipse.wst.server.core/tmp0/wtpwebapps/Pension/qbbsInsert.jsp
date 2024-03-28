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
<hr>
<div class ="container sizeform ">
	<form class="bbs_insertform border p-3 bg-success-subtle bg-opacity-10 border border-info border-start-0 rounded-end">
	<span class="h_line"></span>
		<h3 align="center">게시글 작성</h3>	
		<div class="mb-3">
			<label for="id_bbs" class="form-label">ID</label>
			<input type="text" class="form-control" id="id_bbs" name="BBS_ID" value="${sessionScope.user}" readonly="readonly">
		</div>
		<div class="mb-3">
			<label for="pw_bbs" class="form-label">게시글 비밀번호</label>
			<input type="password" class="form-control" id="pw_bbs" name="BBS_PW">
		</div>
		<div class="mb-3">
			<label for="title_bbs" class="form-label">게시글 제목</label>
			<input type="text" class="form-control" id="title_bbs" name="BBS_TITLE">
		</div>
		<div class="form-floating">
			 <textarea class="form-control"id="con_bbs" name="BBS_CONTENT"></textarea>
			 <label for="con_bbs">본문내용</label>
		</div>
		<div class="form-check">
		    <input class="form-check-input" type="checkbox" value="1" id="secret_bbs" name="BBS_SEC" checked >
		    <label class="form-check-label" for="secret_bbs">비밀글</label>
		</div>
		<div class="bbs_insertbtn">
			<input class="btn btn-success" type="button" value="게시글 등록" onclick="insertQBBS(this.form)">
			<input class="btn btn-success" type="reset" value="다시 쓰기">
			<input type="hidden" value="Insert_QBBS" name="cmd">
		</div>
	</form>
</div>
</body>
<script type="text/javascript" src="js/q_bbs.js"></script>
</html>