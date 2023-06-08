<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	#container{width: 80%; margin: 30px auto; text-align: center}
	fieldset{width: 450px; margin: 0 auto}
	label{width:100px; float: left; text-align: right;}
</style>
<body>
	<div id=container>
	<h3>회원 가입</h3>
		<form action="process02_el.jsp" method="post">
			<fieldset>
			<p>
				<label for="userid">아이디 </label>
				<input type="text" id="userid" name="userid">
			</p>
			<p>
				<label for="passwd">비밀번호 </label>
				<input type="password" id="passwd" name="passwd">
			</p>
			<p>
				<label for="uname">이름 </label>
				<input type="text" id="uname" name="uname">
			</p>
			<p>
				<input type="submit" value="가입하기">
				<input type="reset" value="다시쓰기">
			</p>
			</fieldset>
		</form>
	</div>
</body>
</html>