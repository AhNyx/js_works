<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 	String a = request.getParameter("text1");
	String b = request.getParameter("text2");
	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	Date time = new Date();
	String result = b.substring(0, 1);
		
	
	
	if(result.equals("1") || result.equals("2") ||result.equals("3") ||result.equals("4")){
		response.sendRedirect("Test3.jsp");
	} else if(result.equals("5") || result.equals("6") || result.equals("7") || result.equals("8")){
		response.sendRedirect("Test2.jsp");
	}
	
%>
</body>
</html>