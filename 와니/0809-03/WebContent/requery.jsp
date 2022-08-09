<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%	
	String country = request.getParameter("country");

	

	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List list = new ArrayList<>();
	List list2 = new ArrayList<>();
			
	try{
		String Query = "SELECT name, population FROM country WHERE Continent = ? ORDER BY population DESC";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		pstmt = conn.prepareStatement(Query);
		pstmt.setString(1, country);
	 	rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("name");
			list.add(name);
			String population = rs.getString("population");
			list2.add(population);
		}
		
	} finally {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
	
		// request 객체에 list를 attribute로 설정하기
		request.setAttribute("name", list);
		request.setAttribute("population", list2);
		// 다음 페이지로 forward 시키기
		request.getRequestDispatcher("rerun.jsp").forward(request, response);


%>