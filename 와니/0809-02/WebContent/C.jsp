<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>C</h1>
<% Object result = request.getAttribute("result"); %>
<p><%= result %></p>

<%-- <% Random ran = new Random();
	out.println(ran.nextInt(100)); %> --%>
</body>
</html>