<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 페이지 이동을 제공하는 index.html 작성

	a. 사람 등록페이지(입력 양식 제공)
	-> action = mapping 된 servlet
	-> service 메소드 {
		db행을 추가
		redirect 응답 (사람 목록 페이지)
	}
	
	b. 사람 목록
	-> mapping된 servlet
	-> service 메소드 {
		db 목록 읽기
		(forward) 읽은 목록을 사용자가 볼수있는 페이지(view) jsp로 흐름을 만들어야됨 
	}

 --%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./input">
		<label>이름<input type="text" name="name"/></label>
		<label>나이<input type="number" name="age"/></label>
		<input type="submit" value="등록"/>
		<a href="./person" target="blank">목록보기</a>
	</form>

</body>
</html>