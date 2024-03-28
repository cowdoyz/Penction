<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@6.1.10/index.global.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/reservation.css" rel="stylesheet">
</head>
<body>
    <div class="cal_nav">
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container">
                <a class="navbar-brand" href="/Pension/moveContoller?cmd=moveMain">구트 팬션</a>
                <div class="collapse navbar-collapse " id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:moveResCal();">예약하기</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Pension/moveContoller?cmd=res_view">예약확인</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="container paycon">
   	<div class="h4 pb-2 mb-4 text-danger border-bottom border-danger">객실선택</div>
    	<div>
    	<form action="" class="res_info" method="post">
    	<table class="table-success pay_t">
    		<thead>
    			<tr>
    				<th colspan="1" class="payt_width">객실</th><th>숙박</th><th>인원</th><th colspan="1">이용일</th>
    			</tr>
    			<tr>
    				<th colspan="4"><hr></th>
    			</tr>
    		</thead>
    		<tbody>
    			<c:forEach var="list" items="${roomDataList}">
    			<tr>
		    		<td>
		    			<img src="images/room${list.reservation_State}.jpg" class="payImg">
		    			${list.room_name}방
		    			<input type="hidden" value="${list.reservation_State}" name="ROOMNUMBER">
		    		</td>
		    		<td>
		    			${list.reservation_days}박
		    			<input type="hidden" value="${list.reservation_days}" name="RES_DAY">
		    		</td>
		    		<td>
		    			${list.room_maxperson}명
		    			<input type="hidden" value="${list.room_maxperson}" name="RES_PER">
		    		</td>
		    		<td>
		    			${resDate}
		    		</td>
	    		</tr>
	    		</c:forEach>	
    		</tbody>
    		<tfoot>
    			<tr><td colspan="4"><hr></td></tr>
	    		<tr>
	    			<td colspan="3">총 결제 금액 :</td>
	    			<td><fmt:formatNumber value="${totalPrice}" pattern="#,###"/>원</td>
	    		</tr>
	    		<tr>
	    			<td colspan="4"><hr></td>
	    		</tr>
    		</tfoot>
    	</table>
    		<input type="hidden" value="${totalPrice }" name="totalPrice">
    		<input type="hidden" value="${resDate}" name="RES_DATE">
    		<input type="hidden" value="resPay" name="cmd">
    	 </form>
    	</div>
    </div>
   
    <div class="container payc">
    <form class="payForm">
	<span class="h_line"></span>
	<div class="div1">
    <div class="h4 pb-2 mb-4 text-danger border-bottom border-danger">예약자 정보 입력</div>	
		<div class="mb-3">
			<label for="id_form" class="form-label">예약자 ID</label>
			<input type="text" class="form-control" id="id_form" placeholder="ID를 입력하세요" name="ID" value="${sessionScope.user}" readonly="readonly">
		</div>
		<div class="form-floating">
		  <textarea class="form-control" placeholder="요청사항을 입력해주세요." id="request" name="request"></textarea>
		  <label for="request">요청사항</label>
		</div>	
	</div>	
	<div class="div2">
		<div class="h4 pb-2 mb-4 text-danger border-bottom border-danger">결제 수단 선택</div>	
			<div class="revPayMethod">
		        <input type="radio" name="revMethodSelect" id="payMethod1" class="payMethod">
		        <label for="payMethod1">카드결제</label>
	        </div>
	        <div class="revPaySec">
		     	<input type="radio" name="revMethodSelect" id="payMethod14" class="payMethod">
		     	<label for="payMethod14">카카오페이</label>
	        </div>
	        <div class="revPaySec">
		     	<input type="radio" name="revMethodSelect" id="payMethod15" class="payMethod">
		     	<label for="payMethod15">PAYCO</label>
	        </div>
	        <div class="revPaySec">
		    	<input type="radio" name="revMethodSelect" id="payMethod2" class="payMethod">
		    	<label for="payMethod2">무통장입금</label>
	        </div>
	        <div class="form-check divp">
			    <input class="form-check-input" type="checkbox" value="">
			    <a href="javascript:winOpen();">모든 규정 및 약관에 동의합니다</a>
			</div>
		   	<div class="resupBtn">
				<input class="btn btn-success" type="button" value="요청하기" onclick="resUp(this.form.id_form.value,this.form.request.value)">
				<input class="btn btn-success" type="reset" value="다시 쓰기">
			</div>
	</div>
	</form>
	</div>
</body>
<script type="text/javascript" src="js/pay.js"></script>
<script type="text/javascript" src="js/roomReservation.js"></script>
</html>