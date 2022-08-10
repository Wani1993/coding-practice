<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${ requestScope.name1 }</p>
	<p>${ requestScope.name2 }</p>
	<p>${ applicationScope.name3 }</p>
	<p>${ requestScope.name4 }</p>
	<p>${ applicationScope.name4 }</p>
	<hr/>
	<p>${ name1 }</p>  <!-- 이름만 써도 자기가 알아서 객체를 찾아봐서 value 값을 준다 -->
	<p>${ name2 }</p>
	<p>${ name3 }</p>
	<p>${ name4 }</p>
	<hr/>
	<p>${ none }</p> <!-- 찾아보고 없으면 공백으로 나타난다 -->
</body>
</html>