<%@page import="hello.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty list }">
		<ul>
			<c:forEach var="person" items="${ list }">  <%-- PersonServelt에서 받아온 리스트를 person변수에 다시 넣는다  --%>
				<li>${ person.name } ${ person.age }</li>  <%-- 리스트 안에있는 원소를 하나씩 빼서 쓴다  --%>
			</c:forEach>
		</ul>
	</c:if>

</body>
</html>