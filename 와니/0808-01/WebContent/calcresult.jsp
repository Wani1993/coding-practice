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
		int one = Integer.valueOf(request.getParameter("one"));
		int two = Integer.valueOf(request.getParameter("two"));
		String choice = request.getParameter("math");
		
		if(choice.equals("더하기")) {
			out.println(one + two);
		} else if(choice.equals("빼기")) {
			out.println(one - two);
		} else if(choice.equals("곱하기")) {
			out.println(one * two);
		} else if(choice.equals("나누기")) {
			out.println((double) one / (double) two);
		}
	
	%>
</body>
</html>