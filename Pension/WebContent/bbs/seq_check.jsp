<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../nav.jsp"></jsp:include>
	<div align="center" class="loginmain">
		<h1>게시글 비밀번호</h1>
		<form action="/Pension/bbsContoller" method="post" onsubmit="return notnull(this)">
			<span class="h_line"></span>
			<table class="table-success logintab">
				<tr>
					<td> 
						<span class="input-group-text" id="id">게시글 비밀번호</span>
 					</td>
 					<td>
 						<input type="password" class="form-control" placeholder="게시글 비밀번호를 입력." name="BBS_PW">
 					</td>
 				</tr>
				<tr>
				<td colspan="2" width="3px">&nbsp;
				</td>
				</tr>	
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="비밀번호체크" class="btn btn-outline-secondary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
						<input type="reset" value="Reset" class="btn btn-outline-secondary">
						<input type="hidden" value="seq_check" name="cmd"> 
						<input type="hidden" value="${q_idx }" name="q_idx"> 
					</td>
				</tr>		
			</table>		
		</form>
	</div>
</body>
<script type="text/javascript">
function notnull(f) {
	if(f.BBS_PW.value == '')
	{
		alert("널쓰지마 임마!");
		return false;
	}
	return true;
	
}
</script>
</html>