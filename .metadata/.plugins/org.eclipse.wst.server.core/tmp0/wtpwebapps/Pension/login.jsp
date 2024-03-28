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
	<div align="center" class="loginmain">
		<h1>LOGIN</h1>
		<form action="loginContoller" method="post" >
			<span class="h_line"></span>
			<table class="table-success logintab">
				<tr>
					<td> 
						<span class="input-group-text" id="id">ID</span>
 					</td>
 					<td>
 						<input type="text" class="form-control" placeholder="ID를 입력하세요." name="ID">
 					</td>
 				</tr>
 				<tr>	
 					<td>
						<span class="input-group-text" id="id">Password</span>
 					</td>
					<td> 
	 					<input type="text" class="form-control" placeholder="Password를 입력하세요." name="PWD">
 					</td>
				</tr>
				<tr>
				<td colspan="2" width="3px">&nbsp;
				</td>
				</tr>	
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Login" class="btn btn-outline-secondary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
						<input type="reset" value="Reset" class="btn btn-outline-secondary">
						<input type="hidden" value="login" name="cmd"> 
					</td>
				</tr>		
			</table>		
		</form>
	</div>
</body>

</html>