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
<c:choose>
	<c:when test="${re == 1 }">
	<script type="text/javascript">
		alert("로그인 성공");
		location.href = "/Pension/moveContoller?cmd=moveMain";
	</script>
	</c:when>
	<c:when test="${re == 2 }">
	<script type="text/javascript">
		alert("패스워드 가 틀립니다.");
		location.href = "/Pension/moveContoller?cmd=moveMain";
	</script>
	</c:when>
	<c:otherwise>
	<script type="text/javascript">
	alert("아이디 정보가 없습니다");
	location.href = "/Pension/moveContoller?cmd=moveSignUp";
	</script>
	</c:otherwise>
</c:choose>
</body>
</html>