<%	
	String choice = request.getParameter("result");
	// request.getParameter 로 선택지의 값을가져와서
	
	if(choice == null || choice.length() == 0) { // 아무값도 없다면 안에있는 문장을 통해서 실패했다고 바꿔준다.
		response.sendRedirect("./want.jsp?progress=failed");
	} else if(choice.equals("fruit")) {  // 선택지에 맞게 연결시켜준다
		response.sendRedirect("./fruit.jsp");
	} else if(choice.equals("person")) {
		response.sendRedirect("./persons.jsp");
	}

%>