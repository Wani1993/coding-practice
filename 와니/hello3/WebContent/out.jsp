<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정적 테스트</h1>
	<%= 1 + 2 + 3 %><br>
	
	<%
		out.println(1 + 2 + 3);
		out.println("<br>");
		// 아웃 객체는 출력을 할수있는 기본 객체이다. html 요소를 넣어서 바로 출력할수있게 도와준다.
	%>
	
	<p>jsp의 모든 텍스트는 아웃 객체가 출력합니다.</p>
	
	<% 
		boolean someBool = false;
	
		if(someBool) {
			out.println("<p>참일 때 출력해야하는 텍스트</p>");
		} else {
			out.println("<p>거짓일 때 출력해야하는 텍스트</p>");
		}
	
	%>

</body>
</html>