<%@page import="java.util.Random"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<% 
	String alphabet = request.getParameter("alphabet");
	
	if(alphabet.equals("a")) {
		request.setAttribute("result", LocalTime.now()); // 파라메타 2번째에는 사용할 객체가 들어오면된다.
		request.getRequestDispatcher("A.jsp").forward(request, response); // 흐름은 A.jsp로 가지만 요청한 페이지는 to.jsp이기 때문에 주소창에는 to.jsp로 나타난다.
		//response.sendRedirect("./A.jsp");
	} else if(alphabet.equals("b")) {
		request.setAttribute("result", LocalDate.now());
		request.getRequestDispatcher("B.jsp").forward(request, response);
		//response.sendRedirect("./B.jsp");
	} else if(alphabet.equals("c")) {
		Random r = new Random();
		request.setAttribute("result", r.nextInt(100));
		request.getRequestDispatcher("C.jsp").forward(request, response);
		//response.sendRedirect("./C.jsp");
	} else {
		out.println("뭐했냐");
	}
%>