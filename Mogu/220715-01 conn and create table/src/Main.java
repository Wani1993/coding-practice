import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");  
						
			// table A : 컬럼 B VARCHAR(10) PK
//			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY);";
			String query = "Drop table A;";
			stmt = conn.createStatement();  // 쿼리문을 사용할수있게 해주는 객체 (명령어를 날려주는)
			
			stmt.executeUpdate(query);  // 수정할때 사용하는 메소드 >> 추가(생성), 변경, 삭제 할때 사용  SELECT 빼고 대부분에 사용
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
				stmt.close();
				}
				
				if (conn != null) {
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
