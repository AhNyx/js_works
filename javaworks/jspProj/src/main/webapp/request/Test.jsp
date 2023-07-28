<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%

%>
<head>
<meta charset="UTF-8">
<title>문제</title>

<style type="text/css">
	table, tr, td, th{
	border: 1px solid #ccc;
}
	button{
		padding: 10px;
		text-align: right;
	}


</style>	
</head>
<body>
<form action="Test2.jsp">
	<table>

		<tr>
			<td>이름</td><td>국어</td><td>영어</td><td>수학</td>
		</tr>
	<% for(int i=1;i<=5;i++){%>
		<tr>
			<td><input type="text" name="name" value=""></td>
			<td><input type="text" name="kor"  value="<%=(int)(Math.random()*100)+1%>"></td>
			<td><input type="text" name="eng"  value="<%=(int)(Math.random()*100)+1%>"></td>
			<td><input type="text" name="math"  value="<%=(int)(Math.random()*100)+1%>"></td>		
		</tr>
<%} %>
	</table>
	<button type="submit" onclick="" class="button">입력버튼</button>
</form>
</body>
</html>