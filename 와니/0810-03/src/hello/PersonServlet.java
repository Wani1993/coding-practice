package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		try {
			list = dao.getPerson();
			System.out.println(list.get(0).getName());
			System.out.println(list.get(0).getAge());
			
			PrintWriter pw = resp.getWriter();
			for(int i = 0; i < list.size(); i++) {
				pw.println("이름: " + list.get(i).getName() + "   " + " 나이: " + list.get(i).getAge());
			}
			
			pw.flush();
			
			//req.getRequestDispatcher("result.jsp").forward(req, resp);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
				
	}

}
