<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="dbconn.jsp" %>
	<%
		PreparedStatement pstmt = null;
	
		String sql = "insert into myuser values (101,'hangang','한강','010-1111-3333')";
		
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			out.println("회원추가");
			} catch (Exception e){
			out.println(e.getMessage());
		}
		
	
	%>
</body>
</html>