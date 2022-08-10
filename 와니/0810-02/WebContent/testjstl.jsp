<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- uri는 3번째거, prefix는 c라는 이름으로 쓸거라는것 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" begin="1" end="10">
		<c:if test="${ i % 2 == 0 }"> 
			<p>${ i }</p>
		</c:if>
	</c:forEach>
	
	<c:choose>
		<c:when test="false">  <!-- 조건이 참이면 그 문장만 나오고 밑에꺼는 안나온다 (break) -->
			<p>첫번째 조건이 참일때</p>
		</c:when>
		<c:when test="false">
			<p>두번째 조건이 참일때</p>
		</c:when>
		<c:otherwise>
			<p>모든 조건이 참이 아닐때</p> <!-- 앞에 조건들이 전부 false이면 otherwise 안에 문장이 나온다 -->
		</c:otherwise>
	</c:choose>
</body>
</html>