<%@page import="com.sun.org.apache.xpath.internal.functions.Function"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
	List<String> list = new ArrayList<>();
	for(int i = 0; i < 100; i++) {
		list.add("book" + i);
	}
%>


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
	String pageStr = request.getParameter("page");
	int pageNum = Integer.parseInt(pageStr);
		
	int start = (pageNum - 1) * 10;
	
	for(int i = start; i < start + 10; i++) {
		out.println(list.get(i));
		out.println("<br>");
	}
%>
</body>
</html>