package kr.co.greenart;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() + "/idremember.jsp");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		
		if(password.equals("1234")) {
			//로그인 성공 
			//쿠키(아이디)를 담은 성공 메세지 응답 
			if(remember != null && remember.equals("on")) { // remember에 값이 있는지 확인후
				Cookie c = new Cookie("remember", URLEncoder.encode(id, "utf-8"));  
				c.setMaxAge(60 * 60 * 24);  // 쿠키 유효기간 설정
				resp.addCookie(c);  // 쿠키 추가하기
				
			}
			Cookie c2 = new Cookie("loginok", "ok");
			resp.addCookie(c2);
			
			req.getRequestDispatcher("ok.jsp").forward(req, resp);  // ok 페이지로 이동
		} else {
			//실패
		}
	}

}
