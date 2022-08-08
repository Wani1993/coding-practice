<%-- 오늘날짜를 보여줄수 있는 jsp페이지 --%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- page directive --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 나타내기</title>
</head>
<body>
	<p><%= LocalDate.now() %></p>
</body>
</html>