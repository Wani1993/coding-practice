<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./personresult.jsp">
		<!-- value가 아니라 name을 사용해야 불러올수있다. -->
		<label>이름<input type="text" name="name" required/></label>
		<label>나이<input type="number" name="age" required/></label>
		<input type="submit"/>
	</form>

</body>
</html>