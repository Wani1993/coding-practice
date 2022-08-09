<% 
	int result = 1 + 1;
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp").forward(request, response);
	// forward는 응답을 만들지 않고 다음 페이지로 전달이 된다. (이동할 페이지의 경로를 적어주면된다)
	// redirect 와는 다른점이 페이지 이동없이 현재 페이지에서 다음페이지의 흐름을 불러오는것이다.
	// 때문에 다음페이지에는 사용자가 접속하지 못하게해야하는데 그렇게하려면 다음페이지를 WebContent 폴더안에 넣으면 된다
%>