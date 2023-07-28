<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

String[] nameArr = request.getParameterValues("name");
String[] korArr = request.getParameterValues("kor");
String[] engArr = request.getParameterValues("eng");
String[] mathArr = request.getParameterValues("math");

%>
<html>
<head>
<meta charset="UTF-8">
<title>출력</title>
</head>
<body>
<table>
	<tr>
		<th>이름</th><th>국어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th>
	</tr>
<% for(int i = 0;i<nameArr.length;i++){
	int korInt = Integer.parseInt(korArr[i]);
	int engInt = Integer.parseInt(engArr[i]);
	int mathInt = Integer.parseInt(mathArr[i]); 
	int total = korInt + engInt + mathInt;
	int avg = total / 3;
	%>

		<tr>
			<td><input type="text" name="name" value=<%=nameArr[i] %>></td>
			<td><input type="text" name="kor" value=<%=korInt %>></td>
			<td><input type="text" name="eng" value=<%=engInt %>></td>
			<td><input type="text" name="math" value=<%=mathInt %>></td>
			<td><input type="text" name="total" value=<%= total %>></td>
			<td><input type="text" name="avg" value=<%= avg %>></td>
		</tr>
	<%} %>
</table>


</body>
</html>