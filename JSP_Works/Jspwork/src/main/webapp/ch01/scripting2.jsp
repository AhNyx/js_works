<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문과 스크립트릿 태그 사용</title>
</head>
<body>
	<!-- 선언문 태그 -->
	<%!
		int num1 = 10, num2 = 20;
		int sum;
	%>
	<!-- 스크립트릿 태그 -->
	<%
		sum = num1 + num2;
		out.println("합계: " + sum);
		out.println("<br>");
		//1부터 10까지 출력
		for(int i=1;i<=10;i++){
			out.println(i);
		}
		out.println("<br>");
		//1에서 10중 짝수만 출력
		for(int i=1;i<=10;i++){
			if(i % 2 == 0) out.println(i);
		}
		
	%>
	<%--<p>합계 : <%= sum %> </p> --%>
</body>
</html>