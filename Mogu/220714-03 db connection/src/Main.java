import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";  // 데이터 베이스 주소를 입력
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // 패키지 이름과 클래스 이름
			System.out.println("드라이버 적재 성공");
			
			conn = DriverManager.getConnection(url, id, password);  // getConnection 이라는 스테틱한 메소드가 존재한다. 데이터 베이스에 접속을 할수있게한다.
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다.");
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
