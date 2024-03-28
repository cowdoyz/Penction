<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
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
    <br>
<div class="container" align="center">
	<h1>예약 확인</h1>
	<form action="">
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th>예약번호</th><th>방이름</th><th>방번호</th><th>1박당가격</th><th>인원</th><th>예약일</th><th>요청사항</th><th>예약상태</th><th></th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${!empty list}">
			<c:forEach var="List" items="${list}" >
				<tr>
					<td>${List.reservation_Number }</td>
					<td>${List.room_name }</td>
					<td>${List.room_number }</td>
					<td><fmt:formatNumber value="${List.room_price }" pattern="\#,###"/></td>
					<td>${List.reservation_person }</td>
					<td>${List.reservation_date }</td>
					<td>${List.reservation_request }</td>
					<td>${List.reservation_State }</td>
					<td><button type="button" class="btn btn-outline-light" style="height: 2.4em" id="cancel_btn" >예약취소요청</button>
						<input type="hidden" value="${List.reservation_Number}" name="resNum" id="qlistnum">
					</td>
				</tr>
			</c:forEach>	
			</c:if>
			<c:if test="${empty list}">
				<tr>
					<td colspan="9" align="center">예약된 정보가 없습니다	</td>
				</tr>
			</c:if>
		</tbody>	
	</table>
</form>	
</div>
</body>
<script type="text/javascript" src="js/roomReservation.js"></script>
</html>