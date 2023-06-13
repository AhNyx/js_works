package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	
	static String driverClass = "oracle.jdbc.OracleDriver";  //����̹� �̸�
	static String url = "jdbc:oracle:thin:@localhost:1521:xe"; //db ���(��ġ)
	static String username = "c##mydb";  //user �̸�
	static String password = "mydb";     //��й�ȣ

	public static void main(String[] args) {
		//���� ��ü ����
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("���� ��ü ����: " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}