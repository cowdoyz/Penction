<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/Pension/css/login.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container position-absolute top-50 start-50 translate-middle al_con" align="center">
		<h1 align="center">관리자 로그인</h1>
		<hr>
		<form action="/Pension/loginContoller" class="al_form" method="post">
            <input type="text" placeholder="관리자 아이디" class="in" name="ID">
            <input type="password" placeholder="관리자 비밀번호" class="in" name="PWD">
            <input type="hidden" value="Al_Login" name="cmd">
            <input type="button" id="btn" value="로그인" onclick="al_summit(this.form)"/><br>
        </form>
	</div>
</body>
<script type="text/javascript" src="/Pension/js/pay.js"></script>
</html>