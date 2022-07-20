import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class testtransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false); // 자동으로 DB에 커밋을 해주는 메소드인데 
									   //이것을 false 로 바꿈으로 롤백기능을 사용할수있게한다
			
			
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt2 = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE title = ?");
			for (int i = 0; i < 5; i++) {
				pstmt.setString(1, i + "번째 책");
				pstmt.setInt(2, i * 1000);
				pstmt.addBatch();
			}
			
			pstmt2.setString(1, "책1");
			pstmt2.setInt(2, 5000);
			pstmt2.setString(3, "1번째 책");
			
			pstmt.executeBatch();
			pstmt2.executeUpdate();
			
			conn.commit();  // 로직에서 문제가 발생하지 않았다면 커밋을 해준다. (마지막에 위치시켜서)
			
		} catch (SQLException e) {
			System.out.println("롤백합니다.");
			try {
				conn.rollback();  //로직흐름중에 문제가 발생하면 캐치문으로 와서 롤백을 여기에 위치시켜야한다.
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
