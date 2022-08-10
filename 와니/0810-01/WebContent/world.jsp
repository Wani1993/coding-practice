 
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country" %>
<%
	CountryDAO dao = new CountryDAO();
	List<String> list = dao.getContinents();
	
	request.setAttribute("continent", list);
	request.getRequestDispatcher("continent.jsp").forward(request, response);
%>


<!-- 이러한 클래스를 서블릿(servlet)이라고 한다 -->