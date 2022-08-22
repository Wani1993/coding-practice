<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">	<!-- ajax는 javascript로 요청만 보내는것 (화면이동없이) -->
		<input type="text" name="id" id="userid"/><button id="btnchk">아이디 중복확인</button>  <!-- form 안에 있는 버튼은 기본적으로 submit이 발생한다. -->
		<input type="submit"/>
	</form>
</body>
<script>
	let elem = document.getElementById("btnchk");
	elem.addEventListener("click", function (e) {
		e.preventDefault();
		e.stopPropagation(); // 폼 안에 있는 버튼이 submit이 안되게 해주는 메소드
		let userid = document.getElementById("userid").value;

		if(!userid) {
			return;
		}
		
		fetch("http://localhost:8080/api/idcheck?id=" + userid)
		.then((resp) => resp.text())
		.then((json) => {
			let result = JSON.parse(json); // json 문자열을 객체로 바꾸는 메소드
			if (result.duplicate) {
				alert("중복");
			} else {
				alert("사용 가능");
			}
		})
		.catch((e) => console.log(e));
	});
</script>
</html>