import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("companyNum");
		String businessName = rs.getString("businessName");
		String number = rs.getString("number");
		String address = rs.getString("address");
		
		return new Restaurant(id, businessName, number, address);
	}
	
	
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO Restaurants (businessName, number, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurant r : list) {
				pstmt.setString(1, r.getBusinessName());
				pstmt.setString(2, r.getNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch();
			}
			
			return pstmt.executeBatch();  // 한 쿼리문을 여러번 수행할수있게 해주는 메소드
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		
	}
	
	
	@Override
	public int create(String businessName, String number, String address) throws SQLException {
		String query = "INSERT INTO Restaurants (businessName, number, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null; // statement 의 자식 클래스
										// 쿼리문에 넣을 값을 ? 로 만들어놓고 이후에 내가 원하는  값으로 세팅해준다
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, businessName); // 첫번째 인덱스에 값을 넣는다
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate();  // 위에서 쿼리문을 다 설정을 해놓은 상태라 파라미터를 비워놓는다.
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
				
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM Restaurants";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(resultMapping(rs));
			}
			
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public Restaurant read(int companyNum) throws SQLException {
		String query = "SELECT * FROM Restaurants WHERE companyNum = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, companyNum);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return resultMapping(rs);
			}
			
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return null;
	}

	@Override
	public int update(int companyNum, String businessName, String number, String address) throws SQLException {
		String query = "UPDATE Restaurants SET businessName = ?, number = ?, address = ? WHERE companyNum = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, businessName);
			pstmt.setString(2, number);
			pstmt.setString(3, address);
			pstmt.setInt(4, companyNum);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		
		
	}

	@Override
	public int delete(int companyNum) throws SQLException {
		String query = "DELETE FROM restaurants WHERE companyNum = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, companyNum);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
				
		
	}
	
}
