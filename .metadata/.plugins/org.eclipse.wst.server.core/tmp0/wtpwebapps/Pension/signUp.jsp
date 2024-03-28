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

<div class ="signup">
	<form class="signupForm">
	<span class="h_line"></span>
		<h3 align="center">회원 가입</h3>	
		<div class="mb-3">
			<label for="id_form" class="form-label">ID </label>
			<input type="text" class="form-control" id="id_form" placeholder="ID를 입력하세요" name="ID">
			<div class="invalid-feedback" id = "id_check"></div>
		</div>
		<div class="mb-3">
			<label for="pw_form" class="form-label">Password</label>
			<input type="password" class="form-control" id="pw_form" placeholder="PASSWORD를 입력하세요" name="PW">
			<div class="invalid-feedback" id = "pw_check"></div>
		</div>
		<div class="mb-3">
			<label for="name_form" class="form-label">Name</label>
			<input type="text" class="form-control" id="name_form" placeholder="이름을 입력하세요" name="NAME">
			<div class="invalid-feedback" id = "name_check"></div>
		</div>	
		<div class="mb-3">
			<label for="phone_form" class="form-label">Phone</label>
			<input type="text" class="form-control" id="phone_form" placeholder="ex) 01x-xxxx-xxx" name="PHONE">
			<div class="invalid-feedback" id = "phone_check"></div>
		</div>	
		<div class="mb-3">
			<label for="email_form" class="form-label">Email</label>
			<input type="text" class="form-control" id="email_form" placeholder="ex) xxx@xxxx.com" name="EMAIL">
			<div class="invalid-feedback" id = "email_check"></div>
		</div>	
		<div class="signupBtn">
			<input class="btn btn-success" type="button" value="회원 가입" onclick="signUp()">
			<input class="btn btn-success" type="reset" value="다시 쓰기">
			<input type="hidden" value="signUp.do" name="cmd">
		</div>
	</form>
</div>
</body>
<script type="text/javascript" src="js/sign.js"></script>
</html>