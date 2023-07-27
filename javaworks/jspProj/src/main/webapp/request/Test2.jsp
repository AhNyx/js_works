<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%


String[] nam = {"name","kor","eng","math"};



for(int i=0;i<5;i++){
	request.getParameter(nam[i]+i);
	
}


%>
<html>
<head>
<meta charset="UTF-8">
<title>출력</title>
</head>
<body>
<table>
<% for(int i=1;i<=5;i++){ %>
		<tr>
			
			<td><input type="text" name="name"+i value=<%=request.getParameter("name"+i) %>></td>
			<td><input type="text" name="kor"+i value=<%=request.getParameter("kor"+i) %>></td>
			<td><input type="text" name="eng"+i value=<%=request.getParameter("eng"+i) %>></td>
			<td><input type="text" name="math"+i value=<%=request.getParameter("math"+i) %>></td>
			<td><input type="text" name="total" value=<%= "name"+[i] +"kor"+[i] %>	
		</tr>
	<%} %>
</table>


</body>
</html>