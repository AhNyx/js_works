<!-- 페이지 디렉티브(지시) 태그 -->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 디렉티브 태그</title>
</head>
<body>
	<%
		//배열 선언
		int[] arr = new int[]{10,20,30};	
		
		for(int i=0;i<arr.length;i++){
			out.println(arr[i]);
		}
		out.println("<br>");
		
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("바나나");
		fruitList.add("참외");
		
		//"참외"를 찾기
		out.println(fruitList.get(1) + "<br>");
		
		for(int i=0;i<fruitList.size();i++){
			String fruit = fruitList.get(i);
			out.println(fruit);
		}
		
	%>
</body>
</html>