import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class BookRepository {
	private Book resultMapping(ResultSet rs) throws SQLException { // 읽는 메소드?
	      
	      int bookid = rs.getInt("bookid");
	      String title = rs.getString("title");
	      int price = rs.getInt("price");
	      
	      return new Book(bookid, title, price);
	      
	   }
	//추가
	public int add(Book book) throws SQLException {
		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() + "'," + book.getPrice() + ")";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
			
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//목록 전체
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Book> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				list.add(new Book(bookId, title, price));
			}
			
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}
	
	//검색(제목) or 검색(가격)
	public Book selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM books WHERE title = '" + title + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '" + book.getTitle()
						+ "', price = " + book.getPrice()
						+ " WHERE bookId = " + book.getBookId();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	
//	public static void main(String[] args) {
//		BookRepository repo = new BookRepository();
//		
//		int result;
//		
//		try {
////			result = repo.add(new Book("테스트용", 2000));
////			System.out.println("추가확인" + (result == 1));
//			
////			List<Book> list = repo.list();
////			System.out.println(list);
//			
//			
//			
//			
//		} catch (SQLException e) {
//			System.out.println(e.getErrorCode());
//		}
//	}
}
