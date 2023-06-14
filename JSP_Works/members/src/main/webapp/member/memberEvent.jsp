<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript" src="resources/js/script.js"></script>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
		<section id="memberEvent">
			<h2>행운의 추첨(Good Luck)</h2>
			<img alt="" src="../resources/images/bronx.png">
			<br>
			<button type="button" onclick="play()">추첨</button>
		</section>
		<div id="winner">
			<p id="display"></p>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>