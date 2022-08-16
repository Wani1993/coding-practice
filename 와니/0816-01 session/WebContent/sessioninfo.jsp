<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
	<p>세션 아이디 : <%= session.getId() %></p>
	<p>세션 생성시간 : <%= new Date(session.getCreationTime()) %></p>
	<p>마지막으로 세션에 접근한 시간 : <%= new Date(session.getLastAccessedTime()) %></p>
	<!-- 톰캣 같은 경우에는 기본적으로 30분 유지가 된다. (세션유지시간) -->
</body>
</html>