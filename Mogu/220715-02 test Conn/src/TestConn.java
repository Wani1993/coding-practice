import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

/*
my_db.books

도서관리 프로그램
추가
전체목록
(아이디나 제목이나 가격등으로 검색가능)
삭제
수정
*/
public class TestConn {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean no = true;
		while (no) {
			System.out.println("도서 관리 프로그램");
			System.out.println("1.추가    2.전체목록");
			System.out.println("3.삭제    4.수정");
			System.out.println("5.프로그램종료");
			num = sc.nextInt();
			switch (num) {
			case 1:
				addBook();
				break;
			case 2:
				allPrint();
				break;
			case 3:
				deletBook();
				break;
			case 4:
				changeBook();
				break;
			case 5:
				System.out.println("프로그램 종료");
				no = false;
				break;
			default:
				break;
			}
		}
		sc.close();
		
	}

	public void addBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			System.out.println("도서 추가하기");
			Scanner sc = new Scanner(System.in);
			String title = sc.nextLine();
			sc.next();
			int price = sc.nextInt();

			int add = stmt.executeUpdate("INSERT INTO books (title, price) VALUES ('" + title + "'," + price + ");");
			System.out.println(add + "개가 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	public void allPrint() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books;");
			
			while (rs.next()) { // 다음줄이 있는지 없는지 boolean 값으로 알려줌
				int id = rs.getInt("bookId");
				String title1 = rs.getString("title");
				int price1 = rs.getInt("price");

				System.out.println(id + ", " + title1 + ", " + price1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	public void deletBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("몇번 책을 지울것?");
		
		int del = sc.nextInt();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books;");
			stmt.executeUpdate("DELETE FROM books WHERE bookId = " + del + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}	
	}
	
	public void changeBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
		conn = DBUtil.getConnection();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM books;");
		
		System.out.println("몇번째 책을 수정할것?");
		
		int change = sc.nextInt();
		System.out.println("수정할 이름과 가격?");
		sc.nextInt();
		String title2 = sc.nextLine();
		sc.next();
		int price2 = sc.nextInt();
		stmt.executeUpdate("UPDATE books SET title = " + "'" + title2 + "', price = '" + price2
				+ "' WHERE bookId = " + change + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}	
	}

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean no = true;

		try {

			Scanner scan = new Scanner(System.in);
			int num;

			while (no) {
				conn = DBUtil.getConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM books;");
				System.out.println("도서 관리 프로그램");
				System.out.println("1.추가    2.전체목록");
				System.out.println("3.삭제    4.수정");
				System.out.println("5.프로그램종료");
				num = scan.nextInt();
				switch (num) {
				case 1:
					System.out.println("도서 추가하기");
					Scanner sc = new Scanner(System.in);
					String title = sc.nextLine();
					int price = scan.nextInt();

					int add = stmt
							.executeUpdate("INSERT INTO books (title, price) VALUES ('" + title + "'," + price + ");");
					System.out.println(add + "개가 추가되었습니다.");
					break;
				case 2:
					while (rs.next()) { // 다음줄이 있는지 없는지 boolean 값으로 알려줌
						int id = rs.getInt("bookId");
						String title1 = rs.getString("title");
						int price1 = rs.getInt("price");

						System.out.println(id + ", " + title1 + ", " + price1);
					}
					DBUtil.closeRs(rs);
					DBUtil.closeStmt(stmt);
					DBUtil.closeConn(conn);
					break;
				case 3:
					System.out.println("몇번 책을 지울것?");
					int del = scan.nextInt();
					stmt.executeUpdate("DELETE FROM books WHERE bookId = " + del + ";");
					break;
				case 4:
					System.out.println("몇번째 책을 수정할것?");
					int change = scan.nextInt();
					System.out.println("수정할 이름과 가격?");
					Scanner sc2 = new Scanner(System.in);
					String title2 = sc2.nextLine();
					int price2 = scan.nextInt();
					stmt.executeUpdate("UPDATE books SET title = " + "'" + title2 + "', price = '" + price2
							+ "' WHERE bookId = " + change + ";");
					break;
				case 5:
					System.out.println("프로그램 종료");
					no = false;
					break;
				default:
					break;
				}
			}

//			if(rs.next()) {
////				int result = rs.getInt(1);  // getInt() 안에 들어가는 숫자는 컬럼의 순서를 말하는것
////				System.out.println("확인: " + result);
//				
//				int rere = rs.getInt("price");
//				for(int i = 0; i < 5; i++) {
//					rs.next();
//					}
//				int riri = rs.getInt("price");
//				System.out.println(rere);
//				System.out.println(riri);
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}

	}

}
