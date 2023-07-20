<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jdbc 연동</title>
</head>
<body>
	<%
		String driverClass = "com.mysql.cj.jdbc.Driver";  //드라이버 이름
		String url = "jdbc:mysql://localhost:3306/mydb"; //db 경로(위치)
		String username = "root";  //user 이름
		String password = "root";     //비밀번호
			
		Connection conn = null;
		
		try{
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
		} catch(Exception e){
			out.println("db 연결에 실패했습니다.");
			out.println(e.getMessage());
		}
	
	%>
</body>
</html>