<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<c:choose>
	<c:when test="${re == 1 }">
	<script type="text/javascript">
		
	</script>
	</c:when>
	<c:when test="${re == 2 }">
	<script type="text/javascript">
		alert("패스워드 가 틀립니다.");
		location.href = "/Pension/moveContoller?cmd=move_Al_Login";
	</script>
	</c:when>
	<c:otherwise>
	<script type="text/javascript">
		alert("아이디 정보가 없습니다");
		location.href = "/Pension/moveContoller?cmd=moveMain";
	</script>
	</c:otherwise>
</c:choose>
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
		<h2>예약 확인</h2>
		<form action="">
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>예약번호</th>
					<th>방 이름</th>
					<th>예약ID</th>
					<th>예약자이름</th>
					<th>전화번호</th>
					<th>요청사항</th>
					<th>예약일자</th>
					<th>숙박일</th>
					<th>숙박인원</th>
					<th>예약상태</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="list" items="${list }">
				<tr>
					<td>${list.reservation_number }</td>
					<td>${list.room_name }</td>
					<td>${list.id }</td>
					<td>${list.name }</td>
					<td>${list.phone }</td>
					<td>${list.reservation_request }</td>
					<td>${list.reservation_date }</td>
					<td>${list.reservation_days }</td>
					<td>${list.reservation_person }</td>
					<td>
						<select class="form-select" name="state" id="select_state">
						<c:if test="${list.reservation_state eq '예약대기'}">
		                    <option value="예약대기">${list.reservation_state }</option>
		                    <option value="예약완료">예약완료</option>
		                    <option value="예약가능">예약취소</option>
		                </c:if>  
		                <c:if test="${list.reservation_state eq '예약완료'}">
		                    <option value="예약대기">${list.reservation_state }</option>
		                    <option value="예약가능">예약취소</option>
		                </c:if>  
	                	</select>
	                	<input type="hidden" value="${list.reservation_number }" id="res_num" >
                	</td>
				</tr>		
				</c:forEach>	
			</tbody>
		</table>
		</form>
	</div>
</body>
<script type="text/javascript" src="/Pension/js/roomReservation.js"></script>	
</html>