import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("")) { // try 리소스 문
			pstmt.setString(1, "");
			try (ResultSet rs = pstmt.executeQuery()) {
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("")) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
