<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="login" class="beans.LoginBean"></jsp:useBean>
<jsp:setProperty property="userid" name="login" />
<jsp:setProperty property="passwd" name="login" />

<%
	
	boolean result = login.checkUser();
	
	if(result){
		out.println(login.getUserid()+"님 환영합니다.");
	} else {
		out.println("아이디나 비밀번호를 확인해주세요");
	}


%>

<p>아이디: <jsp:getProperty property="userid" name="login"/></p>
<p>비밀번호: <jsp:getProperty property="passwd" name="login"/> </p>