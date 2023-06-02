<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	

%>

아이디 <%= userid%>
비밀번호 <%= passwd %>