<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>어플리케이션 기본 객체에 설정이 되어 있는 값을 확인하는 페이지</p>
	<%= application.getAttribute("myStr") %>
	<%= application.getAttribute("myInt") %>
</body>
</html>