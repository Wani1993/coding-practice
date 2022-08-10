<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>따로연습하기</title>
</head>
<body>
<!-- ul, li, 목록 표현 -->

<form action="country.jsp">
	<%
		
		List<String> list = (List<String>) request.getAttribute("continent");
	%>
	<select name="continent">
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