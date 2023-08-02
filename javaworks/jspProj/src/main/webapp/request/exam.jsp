<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	int cnt = 5;
	


%>
<head>
<meta charset="UTF-8">
<title>exam</title>
</head>
<body>
<h1>exam</h1>
<form action="numReg.jsp" name="qwer">
	<table border="">
		<tr>
			<td colspan="2" align="right">
				칸수:
				<select name="cnt" id="" onchange="cntChange()">
				<%  for(int i = 5; i<=30 ; i+=5){ 
					String sel = "";
					
					if(i==cnt){
						sel = "selected";
					}
					
				%>
					<option <%=sel %> ><%=i %></option>
					
					<%} %>
				</select>
			</td>
		</tr>
	
	
		<% for(int i = 0; i<cnt ; i++){ %>
		<tr>
			<td><%=i %></td>
			<td><input type="text" name="no" value="<%=(int)(Math.random()*100)+10	%>" /></td>
		</tr>
		<%} %>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="계산" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>