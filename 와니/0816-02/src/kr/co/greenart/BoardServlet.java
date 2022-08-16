package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board")
public class BoardServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("사용자가 GET방식의 요청하였습니다. (게시판 목록)");
		
//		System.out.println("세션 값을 확인합니다.");
//		HttpSession session = req.getSession();
//		Object loginid = session.getAttribute("loginid");
//		
//		if(loginid != null) {
//			System.out.println("로그인 확인되었습니다. 게시판 목록으로 foward합니다.");
			List<String> articles = new ArrayList<String>(Arrays.asList("글1", "글2", "글3"));
			req.setAttribute("articles", articles);
			
			req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
//		} else {
//			System.out.println("로그인 되지 않은 유저.");
//			
////			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 로그인 되지않았을때 응답코드를 날려준다. (401번 코드 인증이 되지않았을때)
////			req.getRequestDispatcher("needlogin.jsp").forward(req, resp);
//			resp.sendError(401);
//		}
	}
 
}
