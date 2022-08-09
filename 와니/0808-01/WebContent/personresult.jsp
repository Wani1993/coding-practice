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
	String name = request.getParameter("name");
	name = name.trim();
	String age = request.getParameter("age");
	
	
	
	if(age == null || age.trim().length() == 0) {
		response.setStatus(400); // 아무것도 입력하지않았을때 응답 코드를 400으로 설정해주는것 
		out.println("잘못된 입력");
	} else {
		
		if(name.length() == 0) { // 이름의 길이가 0일때 리다이렉트해주는부분
			response.sendRedirect("./person.jsp");
		} else {
			out.println( "(" + name + ", " + age + ")님 반갑습니다.");
		}
	} 
	
	
	%>

</body>
</html>