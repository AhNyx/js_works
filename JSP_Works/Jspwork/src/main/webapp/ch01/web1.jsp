<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>hello~</title>
</head>
<body>
	<h1>ó�� ����� �� ������</h1>
	<%
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
		String current_time = now.format(datetime);	
		
		response.setIntHeader("Refresh", 5);
	%>
	<h3>���� ��¥�� �ð��� <%= current_time %></h3>
</body>
</html>