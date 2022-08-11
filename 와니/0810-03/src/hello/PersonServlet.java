package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PersonServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Content-type", "text/plain; charset=utf-8");
		PersonDAO dao = new PersonDAO();
		
		
		List<Person> list = null;
		Map<String, String> nameError = null;
		try {
			list = dao.getPerson();
			PersonValidator validator = new PersonValidator();
			for(int i = 0; i < list.size(); i++) {
			 nameError = validator.isValidName(list.get(i).getName());
			}
//			resp.sendRedirect(req.getContextPath() + "/result.jsp");
			req.setAttribute("list", list);
			req.getRequestDispatcher("result.jsp").forward(req, resp);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
				
	}

}
