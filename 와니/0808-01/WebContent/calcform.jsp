<!--  
	입력 폼 
	숫자 1
	숫자 2
	
	연산자 + - * / 선택해서
	전송
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./calcresult.jsp">
		<label>숫자입력<input type="number" name="one"/></label><br>
		<select name="math" size="1">
			<option value="">선택하세요.</option>
			<option value="더하기">+</option>
			<option value="빼기">-</option>
			<option value="곱하기">X</option>
			<option value="나누기">/</option></select><br>
		<label>숫자입력<input type="number" name="two"/></label><br>
		<input type="submit" value="정답"/>
	</form>

</body>
</html>