<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ import  %>
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
		text-align: right
	}


</style>	
</head>
<body>
<form action="Test2.jsp">
	<table>
		<tr>
			<td>이름</td><td>국어</td><td>영어</td><td>수학</td>
		</tr>
		<tr>
			<td><input type="text" name="name1"></td>
			<td><input type="text" name="kor1"></td>
			<td><input type="text" name="eng1"></td>
			<td><input type="text" name="math1"></td>		
		</tr>
		<tr>
			<td><input type="text" name="name2"></td>
			<td><input type="text" name="kor2"></td>
			<td><input type="text" name="eng2"></td>
			<td><input type="text" name="math2"></td>			
		</tr>
		<tr>
			<td><input type="text" name="name3"></td>
			<td><input type="text" name="kor3"></td>
			<td><input type="text" name="eng3"></td>
			<td><input type="text" name="math3"></td>			
		</tr>
		<tr>
			<td><input type="text" name="name4"></td>
			<td><input type="text" name="kor4"></td>
			<td><input type="text" name="eng4"></td>
			<td><input type="text" name="math4"></td>
			
		</tr>
		<tr>
			<td><input type="text" name="name5"></td>
			<td><input type="text" name="kor5"></td>
			<td><input type="text" name="eng5"></td>
			<td><input type="text" name="math5"></td>
		</tr>

	</table>
	<button type="submit" onclick="" class="button">입력버튼</button>
</form>


</body>
</html>