<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= request.getAttribute("continent") %></title>
</head>
<body>

	<c:if test="${ not empty countries }">
	<ul>	
		<c:forEach var="countries" items="${ countries }"> <!-- 아이템즈 배열, list, set, map에 서만 사용가능 -->
			<li>${ countries.name } ${ countries.population }</li> <!-- get 생략 자바문은 다 없어졌으며 필요한건 클래스로 만듬  -->
		</c:forEach>
	</ul>
	</c:if>
</body>
</html>