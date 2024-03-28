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
                        <li class="nav-item">
                            <button type="button" class="btn btn-outline-secondary" onclick="moveAdimLogin()">관리자 페이지</button>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="container cal_main">
        <div id='calendar-container'>
            <div id='calendar'></div>
        </div>
        <div class="cal_info">
            <div class="cal_infodate">
                <p id="cal_info">${list[0].reservation_date }</p>
            </div>
            <hr>
            <div class="cal_infotb">
                <table cellspacing="10" class="infotb">
                    <tr>
                        <th>주소</th>
                        <td>Sosan Hotel, 평양 평양 직할시 북한</td>
                    </tr>
                    <tr>
                        <th>전화번호</th>
                        <td> 010 - 4444 - 4444</td>
                    </tr>
                    <tr>
                        <th>결제방법</th>
                        <td>무통장 / 카드</td>
                    </tr>
                    <tr>
                        <th>계좌번호</th>
                        <td>(신안은행)119-409-550044</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="h4 pb-2 mb-4 text-danger border-bottom border-danger">객실선택</div>
        <form action="" method="post">
            <div id="input_res">
                <c:forEach var="res" items="${list}">
                    <div class="res_main">
                        <div class="res_check">
                            <input class="form-check-input checksize" type="checkbox" value="${res.room_number}" name="checkRES" <c:if test="${res.reservation_State eq '예약대기' || res.reservation_State eq '예약완료'}">disabled</c:if> >
                        </div>
                        <div class="res_img" <c:if test="${res.reservation_State eq '예약대기' || res.reservation_State eq '예약완료'}">style="opacity: 0.5;"</c:if>>
                            <img src="images/room${res.room_number}.jpg" class="img-thumbnail">
                            <div>
                                <table>
                                    <tr>
                                    	<c:choose>
	                                    	<c:when test="${res.reservation_State eq '예약대기' || res.reservation_State eq '예약완료'}">
	                                        	<td class="font_stateR"> ${res.reservation_State}</td>
	                                        </c:when>
	                                        <c:otherwise>
	                                        	<td class="font_stateG"> ${res.reservation_State}</td>
	                                        </c:otherwise>
                                        </c:choose>
                                    </tr>
                                    <tr>
                                        <td>${res.room_name }</td>
                                    </tr>
                                    <tr>
                                        <td>최대 (4)명</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <fmt:formatNumber value="${res.room_price }" pattern="#,###" />
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                        <div class="gura">
                        </div>
                        <div>
                            <label for="form-select">기 간</label>
                            <select class="form-select park" name="park_${res.room_number}" <c:if test="${res.reservation_State eq '예약대기' || res.reservation_State eq '예약완료'}">disabled</c:if>>
                                <option value="1">1박</option>
                                <option value="2">2박</option>
                                <option value="3">3박</option>
                                <option value="4">4박</option>
                                <option value="5">5박</option>
                            </select>
                        </div>
                        <div class="padding_sel">
                            <label for="form-select">인 원</label>
                            <select class="form-select person" name="person_${res.room_number}" <c:if test="${res.reservation_State eq '예약대기' || res.reservation_State eq '예약완료'}">disabled</c:if>>
                                <option value="1">1명</option>
                                <option value="2">2명</option>
                                <option value="3">3명</option>
                                <option value="4">4명</option>
                            </select>
                        </div>
                        <div>
                            <p class="money">${res.room_price }</p>
                        </div>
                    </div>
                    <hr>
                </c:forEach>
            </div>

            <hr>
            <div class="totalPriceLayer">
                <div class="totalPriceTblLayer">
                    <table cellpadding="20" cellspacing="10" class="totalPriceTbl">
                        <tbody>
                            <tr>
                                <td>&nbsp;</td>
                                <th style="width:35%;" class="nowPriceText">즉시결제</th>
                            </tr>
                            <tr>
                                <th>총 결제 금액</th>
                                <td class="nowPriceText">
                                    <label id="totalPriceText" class="totalPriceText">0원</label>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="res_pricetotal_btn">
                    <div class="revBtn" style="display: none;">
                        <button class="btn btn-outline-primary resBTN" onclick="moveRES(this.form)" id="sbtn">예약하기</button>
                        <input type="hidden" value="resPaymove" name="cmd">
                        <input type="hidden" name="totalPrice" class="totalPrice" value="">
                        <input type="hidden" name="resDate" class="resDate" value="">
                    </div>
                </div>
            </div>
        </form>
    </div>

</body>
<script type="text/javascript" src="js/roomReservation.js"></script>

</html>