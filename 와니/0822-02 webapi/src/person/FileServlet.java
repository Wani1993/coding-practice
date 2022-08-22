package person;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/fileupload")
@MultipartConfig(location = "d:\\temp", fileSizeThreshold = 10 * 1024 * 1024
					, maxFileSize = 50 * 1024 * 1024) // 용량이 설정해놓은것을 넘어 서면 임시폴더 저장하겠다~ 라는 말
public class FileServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Part p = req.getPart("fileupload"); // 파일은 이진데이터라서 Part 객체로 사용
		System.out.println(p.getName()); // 파라미터 이름
		System.out.println(p.getSubmittedFileName()); // 사용자가 올린 파일 이름
		for (String header : p.getHeaderNames()) {
			System.out.println(header + " : " + p.getHeader(header));
		}
		
		
		String contextPath = getServletContext().getRealPath(""); // 톰캣 경로를 찾아보는거
		
		System.out.println(contextPath); // 파일이 저장되는 경로
		
		Path directory = Paths.get(contextPath); // 문자열을 path객체로 만든거
		Files.copy(p.getInputStream(), directory.resolve(p.getSubmittedFileName()), StandardCopyOption.REPLACE_EXISTING);
		// Files 메소드는 파일 입출력 할때 사용  StandardCopyOption.REPLACE_EXISTING 을 써줘야 예외가 발생하지않는다.
		
		resp.sendRedirect("/" + URLEncoder.encode(p.getSubmittedFileName(), "UTF-8"));
	}
}
