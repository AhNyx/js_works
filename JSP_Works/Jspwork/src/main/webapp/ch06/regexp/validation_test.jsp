<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규 표현식 예제</title>
<script type="text/javascript">
	function checkMember(){
		//alert("test");
		//1.아이디나 비밀번호가 비어있을때 처리
		//2.비밀번호에 동일한 아이디가 포함되어있을때
		//"비밀번호는 아이디를 포함할수 없습니다"
		//3.이름은 숫자로 시작할 수 없습니다
		let regExp = /^[a-zA-Z가-힣]/; // 문자로 시작해야함
		
		let id = document.member.id;
		let pw = document.member.passwd;
		let name = document.member.name;
		if(id.value === "" || pw.value === ""){
			alert("아이디 비밀번호를 입력해주세요");
		}
		else if(pw.value.search(id.value) > -1){
			alert("비밀번호는 아이디를 포함할 수 없습니다.");
			pw.focus();
		} else if (!regExp.test(name.value)){
			alert("이름은 숫자로 시작할 수 없습니다.");
			pw.focus();
		} else {
			document.member.submit();
		}
	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="test_process.jsp" method="post" name="member">
		<p>아이디: <input type="text" name="id"></p>
		<p>비밀번호: <input type="password" name="passwd"></p>
		<p>이름 : <input type="text" name="name"></p>
		<p><button type="button" onclick="checkMember()">가입하기</button></p>
	</form>
</body>
</html>