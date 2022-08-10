package hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO dao = new PersonDAO();
		try {
			dao.setPerson(req.getParameter("name"), Integer.valueOf(req.getParameter("age")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./person");
	}
	

}
