package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {

	@Override                      //      request                   response
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String continent = req.getParameter("continent");
		CountryDAO dao = new CountryDAO();
		List<Country> list = null;
		try {
			list = dao.getCountryByContinent("asia");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		req.setAttribute("countries", list);
		req.setAttribute("continent", continent);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
				
		
	}
	
	
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// 요청 주소에 요청 흐름 제어
//		req.setAttribute("title", "서블릿에서 설정한 제목");
//		req.setAttribute("message", "서블릿에서 설정한 메세지");
//		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);
//	}
	
}
