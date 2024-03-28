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
<div class=container-fluid>
<div id="carousel" class="carousel slide">
	  <div class="carousel-inner">
	    <div class="carousel-item active">
	      <img src="images/back.jpg" class="d-block w-100">
	    </div>
	    <div class="carousel-item">
	      <img src="images/back1.jpg" class="d-block w-100">
	    </div>
	    <div class="carousel-item">
	      <img src="images/back2.jpg" class="d-block w-100">
	    </div>
	  </div>
	  <button class="carousel-control-prev" type="button" data-bs-target="#carousel" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  <button class="carousel-control-next" type="button" data-bs-target="#carousel" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	</div>
</div>

<div class="Contact">
<h2>Contact Us</h2>
<span class="h_line"></span>
<p>주소 : Sosan Hotel, 평양 평양 직할시 북한</p>
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d473571.768732115!2d125.45430179934236!3d38.76069306933711!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357e1c7f2231d217%3A0x5a160c7af8da354!2z7ISc7IKw7Zi47YWU!5e0!3m2!1sko!2skr!4v1704634506164!5m2!1sko!2skr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
<p>전화번호 : 010-4001-2100</p>
</div>
<footer>
<div id="foot_company">
<h4>About Us</h4>
<address class="foot_line">상호명 : 구트 펜션    주소 : Sosan Hotel, 평양 평양 직할시 북한      전화번호 : <span class="eng_num bold">010-4001-2100</span>    대표 : 관리자      사업자번호 : <span class="eng_num bold">230-22-000047</span><br>
계좌번호 : <span class="bold">신안은행</span> <span class="eng_num bold">110-409-550044</span> <span class="bold">예금주 : 관리자</span>  
개인정보책임자 : 관리자     이메일 : <span class="eng_num bold">admin@naver.com</span></address>
</div>
</footer>
</body>
</html>