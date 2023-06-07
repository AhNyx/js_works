<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


	//쿠키를 가져와서 삭제하기
	Cookie[] cookies = request.getCookies();

	for(int i=0;i<cookies.length;i++){
		cookies[i].setMaxAge(0);
		//유효기간이 만료된 쿠기 응답
		response.addCookie(cookies[i]);
	}
	
	
	response.sendRedirect("cookies02.jsp");
%>