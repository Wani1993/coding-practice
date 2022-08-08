<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./switchpath.jsp">
		<input type="radio" name="result" value="person"/>사람
		<input type="radio" name="result" value="fruit"/>과일
		<input type="submit"/>	
	</form>
	<%= request.getParameter("progress") %>
</body>
</html>