<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<h1>회원가입 페이지</h1>
<form action="rere.jsp" method="post">
	<input type="text" name="text1" placeholder="주민번호 앞자리">
	<input type="text" name="text2" placeholder="주민번호 뒷자리">
	<button type="submit" >확인</button>
</form>

</body>
</html>