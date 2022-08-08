<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>로그인 처리 요청이 전달되었나유?</p>
	<%
		String id = request.getParameter("userid");
	
		// 입력값이 있으면 xx님 반갑습니다.
		// 해당 파라미터 값이 전달이 되었으나 입력값이 없으면 ""
		if(id.length() > 0) {
			out.println(id + "님 반갑습니다.");
		} else {
			out.println("입력해주세요.");
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>