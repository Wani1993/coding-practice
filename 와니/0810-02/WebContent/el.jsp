<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>JSP Expression Language</p>
	${ "qwer" }
	${ 123 }
	${ 55.432 }
	${ true }
	<br>
	${ 1 + 2 }
	${ true && false }
	<br>
	${ pageContext.request.requestURI } <!-- getrequest면 get을 빼고 적어도 된다. 모든객체들 get을 빼고 적어도 됌 -->
	
	
</body>
</html>