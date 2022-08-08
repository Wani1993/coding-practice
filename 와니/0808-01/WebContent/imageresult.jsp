<%@page import="java.util.ArrayList"%>
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
		String result[] = request.getParameterValues("num");
		// 배열에다가 입력값을 넣어두고 반복문을 통해서 조건을 걸어 이미지가 나오게 한다.
	for(int i = 0; i < result.length; i++) {
		if(result[i].equals("1")) {
			out.println("<img src=\"./images/chunsik/춘식1.png\" />");
		}
		if(result[i].equals("2")) {
			out.println("<img src=\"./images/chunsik/춘식2.png\" />");
		}
		if(result[i].equals("3")) {
			out.println("<img src=\"./images/chunsik/춘식3.png\" />");
		}
	}
	%>

</body>
</html>