<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="requery.jsp">
	<%
		List<String> list = (List<String>) request.getAttribute("Continent");
	%>
	<select name="country">
	<% 
		for(int i = 0; i < list.size(); i++) {
			out.println("<option>" + list.get(i) + "</option>");
		}
	%>
	</select>
	<input type="submit"/>
</form>

</body>
</html>