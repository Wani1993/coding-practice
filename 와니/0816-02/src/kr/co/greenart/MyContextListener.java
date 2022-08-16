package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class MyContextListener implements ServletContextListener {
	private static DataSource dataSource;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("웹 어플리케이션 시작시 이벤트가 발생합니다.");
		
		// 웹 어플리케이션 첫 구동 시 필요한 설정을 할 수 있음.
		// xml 에다가 리스너를 추가해야한다(패키지명, 클래스이름만 넣어도됨)
		ServletContext context = sce.getServletContext();
		
		String driver = context.getInitParameter("driver");
//		System.out.println("설정값 확인 : " + driver);
		String dburl = context.getInitParameter("dburl");
		String dbid = context.getInitParameter("dbid");
		String dbpw = context.getInitParameter("dbpw");
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(dburl);
		ds.setUsername(dbid);
		ds.setPassword(dbpw);
		
		dataSource = ds;
	}
	// Connection을 메소드화
	// 외부라이브러리로 커넥션 객체를 만든다.
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
}
