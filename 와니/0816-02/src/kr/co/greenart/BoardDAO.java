package kr.co.greenart;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardDAO {
	public List<BoardArticle> 게시글목록가져오기() throws SQLException {
		// DB 입출력을 통해 결과 값 만들어주기
		String query = "SELECT * FROM my_db.boardarticle";
		List<BoardArticle> list = new ArrayList<>();
		
		try(Connection conn = MyContextListener.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				
				list.add(new BoardArticle(id, title, content));
			}
		}
		return list;
	}
}
