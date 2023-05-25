package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB 연결 및 종료 기능을 하는 클래스
public class JDBCUtil {
	//필드
	static String driverClass = "oracle.jdbc.OracleDriver"; //오라클 드라이버
	static String url = "jdbc:oracle:thin:@localhost:1521:xe"; //db경로
	static String username = "c##mydb";
	static String password = "mydb";
	
	//DB 연결 메소드
	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url, username, password);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
