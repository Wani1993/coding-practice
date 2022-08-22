package person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/idcheck")
public class IDCheckServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		String json;
		if(id.length() > 5) {  // 아이디가 5자 이상이면 중복이다 라는 로직
			json = "{\"duplicate\":true}";
		} else {
			json = "{\"duplicate\":false}";
		}
		resp.setContentType("application/json; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();
	}
	
}
