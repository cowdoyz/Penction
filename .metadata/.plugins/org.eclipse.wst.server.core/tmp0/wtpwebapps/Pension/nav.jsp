<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/bbs.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid	">
	<div>
		<ul class="nav justify-content-end">
			<c:if test="${empty sessionScope.user}">
		    <li class="nav-item ">
	    	  <a class="nav-link link-success" href="/Pension/moveContoller?cmd=moveLogin">■ LOGIN</a>
		    </li>
		    </c:if>
		    <c:if test="${!empty sessionScope.user}">
		    <li class="nav-item">
		  	  <a class="nav-link link-success" href="/Pension/moveContoller?cmd=logOut">■ LOGOUT</a>
		   </li>
		   </c:if>
		    <li class="nav-item">
		  	  <a class="nav-link link-success" href="/Pension/moveContoller?cmd=moveSignUp">■ SIGNUP</a>
		   </li>
		    <li class="nav-item">
		  	  <a class="nav-link link-success" href="/Pension/bbsContoller?cmd=moveQBBS">■ Q&A</a>
		   </li>
		</ul>
	</div>
	<div class="logo">
		<a href="/Pension/moveContoller?cmd=moveMain"><img src="images/logo.png" class="img-fluid"></a>
	</div>
	<div class="navback">
	<ul class="nav nav-pills">
	  <li class="nav-item dropdown">
	    <a class="nav-link dropdown-toggle" href="#" role="button">팬션소개</a>
	    <ul class="dropdown-menu">
	      <li><a class="dropdown-item c1" href="#">오시는 길</a></li>
	      <li><a class="dropdown-item c1" href="#">포토 갤러리</a></li>
	    </ul>
	  </li>
	    <li class="nav-item dropdown">
	    <a class="nav-link dropdown-toggle"  href="#" role="button">객실보기</a>
	    <ul class="dropdown-menu">
	      <li><a class="dropdown-item c1" href="#">객실보기</a></li>
	    </ul>
	  </li>
	   <li class="nav-item dropdown">
	    <a class="nav-link dropdown-toggle" href="#" role="button">예약안내</a>
	    <ul class="dropdown-menu">
	      <li><a class="dropdown-item c1" href="#">예약안내</a></li>
	      <li><a class="dropdown-item c1" href="javascript:moveResCal();">실시간 예약</a></li>
	    </ul>	
	  </li>
	   <li class="nav-item dropdown">
	    <a class="nav-link dropdown-toggle"  href="#" role="button">커뮤니티</a>
	    <ul class="dropdown-menu">
	      <li><a class="dropdown-item c1" href="#">공지사항</a></li>
	      <li><a class="dropdown-item c1" href="/Pension/bbsContoller?cmd=moveQBBS">고객문의</a></li>
	    </ul>
	  </li>
	</ul>
	</div>
</div>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="js/roomReservation.js"></script>
</html>