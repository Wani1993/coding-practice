import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class ResRepository {
	// c(상호명,전화번호,주소) or C(음식점) : 행개수
	// R() : List<음식점>
	// R(pk) : 음식점
	// U(pk, 새상호명, 새 전화번호, 새 주소) or U(음식점) : 행개수
	// D(pk) : 행 개수
	

	
	public Restaurant resultMapping(ResultSet rs) throws SQLException {
		int companyNum  = rs.getInt("companyNum");
		String businessName = rs.getString("businessName");
		String number  = rs.getString("number");
		String address = rs.getString("address");
		
		return new Restaurant(companyNum, businessName, number, address);
	}
	
	// 추가하기
	public int add(Restaurant res) throws SQLException { 
		String query = "INSERT INTO Restaurants (businessName, number, address) VALUES ('" + res.getBusinessName()
				+ "','" + res.getNumber() + "', '" + res.getAddress() + "')";

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
	
	// 목록 불러오기
	
	public List<Restaurant> list() throws SQLException {
		String query = "SELECT * FROM restaurants";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Restaurant> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
		return list;
	}
	
	//검색(상호명) or 검색(pk)
	public Restaurant selectByName(String businessName) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE businessName = '" + businessName + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
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
	
	// 삭제
	public int delete(int companyNum) throws SQLException {
		String query = "DELETE FROM Restaurants WHERE companyNum = " + companyNum;
		
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
	
	

	public static void main(String[] args) {
		ResRepository repo = new ResRepository();
		
		int result;
		try {
//			result = repo.add(new Restaurant("연습중", "051-744-6666", "부산 진구 어딘가"));
//			System.out.println(result + "행이 추가되었습니다.");
			
//			List<Restaurant> list = repo.list();
//			System.out.println(list);
			
//			System.out.println(repo.selectByName("도연정"));
			
			result = repo.delete(6);
			System.out.println(result + "된다");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
