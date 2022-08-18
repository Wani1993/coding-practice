package article.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import article.model.ArticleContent;
import jdbc.jdbcUtil;

public class ArticleContentDao {
	
	public ArticleContent insert(Connection conn, ArticleContent content) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(
					"insert into article_content" +
					"(article_no, content) values(?, ?)");
			pstmt.setLong(1, content.getNumber());
			pstmt.setNString(2, content.getContent());
			int insertCount = pstmt.executeUpdate();
			if (insertCount > 0) {
				return content;
			} else {
				return null;
			}
		} finally {
			jdbcUtil.close(pstmt);
		}
	}
}
