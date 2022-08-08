<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/wani/requestInfo.jsp" method="post"> 
<!-- 메소드는 사용자가 submit버튼을 눌렀을때 어떠한 방식으로 나올지 명시해주는것 default값으로 get이 나오는데 이것은 사용자에 요청이 주소에 나타남 -->
		<label>이름<input type="text" name="name"></label>
		<label>나이<input type="text" name="number"></label>
		<label><input type="radio" name="gender" value="male"/>남성</label>
		<label><input type="radio" name="gender" value="female"/>여성</label>
		<label><input type="checkbox" name="hobby" value="java">자바</label>
		<label><input type="checkbox" name="hobby" value="html">하이퍼 텍스트 마크업 랭귀지</label>
		<label><input type="checkbox" name="hobby" value="css">캐스캐이딩 스타일 시트</label>
		<label><input type="checkbox" name="hobby" value="javascript">자바스크립트</label>
		<input type="submit" value="입력완료"/>
	</form>

</body>
</html>