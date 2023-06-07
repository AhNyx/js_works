<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="abDAO" class="address.AddrBookDAO"  scope="application"></jsp:useBean>
<%
	String username = request.getParameter("username");
	abDAO.deleteAddrBook(username);
	
	response.sendRedirect("addrList.jsp");
%>