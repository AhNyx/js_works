<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
<%
	String[] noArr = request.getParameterValues("no");

	int result;	
	int[] intArr;	
	
	int a = Integer.parseInt(noArr);
	
	for(int i = 0; i<a.length;i++){
		if(a % 2 == 0)
			intArr[i] = a;
	}
	for(int i : intArr){
		result += i;
	}
	
	
%>
<h1>numReg</h1>
no : <%=request.getParameter("no") %><br/>
noArr : <%=Arrays.toString(noArr) %>

</body>
</html>