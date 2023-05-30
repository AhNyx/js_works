<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 빈즈(Java Beans)</title>
</head>
<body>

	<!-- id는 객체와 같음 (new) 한것과 동일 -->
	<jsp:useBean id="calc" class="beans.CalcBean" />
	
	
	<%
	
		out.println(calc.calculate(3));
	%>
</body>
</html>