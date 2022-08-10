
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country" %>
<%
	String continent = request.getParameter("continent");
	CountryDAO dao = new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent);
	
	request.setAttribute("countries", list);
	request.setAttribute("continent", continent);
	request.getRequestDispatcher("result.jsp").forward(request, response);
%>

<!-- 이러한 클래스를 서블릿(servlet)이라고 한다 -->