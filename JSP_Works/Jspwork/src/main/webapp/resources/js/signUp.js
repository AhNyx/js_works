/**
 * 회원 가입 폼 처리
 */
function signUp(){
	let form = document.form1;
	let name = form.name.value;
	let email = form.email.value;
	
	alert("정말로 가입하시겠습니까?");
	document.getElementById("regForm").style.display = "none";
	document.getElementById("rname").innerHTML = name;
	document.getElementById("rmail").innerHTML = email;
	
	document.getElementById("result").setAttribute('style', 
			"display: block; background: lightgreen; padding:5px 20px;");
} 