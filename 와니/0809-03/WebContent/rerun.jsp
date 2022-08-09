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
<%
	List<String> list = (List<String>) request.getAttribute("name");
	List<String> list2 = (List<String>) request.getAttribute("population");
%>

<div>
	나라  인구
</div>

<ul>
<%
	for(int i = 0; i < list.size(); i++) {
		out.println("<li>" + list.get(i) + " " + list2.get(i) + "</li>");
	}
%>
</ul>


</body>
</html>