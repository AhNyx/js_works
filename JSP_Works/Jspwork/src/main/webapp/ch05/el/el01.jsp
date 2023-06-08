<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL(Expression Language)</title>
</head>
<body>
	<h3>데이터 표현</h3>
	<p>${"hello"}</p>
	<p>${"안녕하세요"}</p>
	<p>${12}</p>
	<p>${2.54}</p>
	<p>${10 + 20}</p>
	<p>${10 + "20"}</p>
	
	<h3>산술 연산</h3>
	<p>\${7 + 3} : ${7 + 3}
	<p>\${7 - 3} : ${7 - 3}
	<p>\${7 * 3} : ${7 * 3}
	<p>\${7 / 3} : ${7 / 3}
	<p>\${7 % 3} : ${7 % 3}
	
	<h3>비교 연산</h3>
	<p>${10 == 10}, ${10 eq 10}
	<p>${"face" == "face"}, ${"face" eq "face"}
<%-- 	<p>${10 != 10}, ${10 ne 10} --%>
	<p>${10 < 20}, ${10 lt 20}
	<p>${10 > 20}, ${10 gt 20}
	
	<h3>논리 연산</h3>
	<p>${(10 == 10) && (10 > 20)}
	<p>${(10 == 10) and (10 > 20)}

</body>
</html>