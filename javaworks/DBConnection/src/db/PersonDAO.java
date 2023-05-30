package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO - 데이터베이스 연결 및 연동(입력, 검색, 수정, 삭제)
public class PersonDAO {
	//필드
	private Connection conn = null; // 연결 처리 클래스
	private PreparedStatement pstmt = null; //sql 처리 클래스
	private ResultSet rs = null;
	
	//연결 - 클래스 작성 호출
	
	//자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) VALUES(?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			
			pstmt.executeUpdate(); //실행 처리
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//자료 검색(목록조회)
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<Person>();
		try {
			conn = JDBCUtil.getConnection(); //conn - 연결 객체 생성
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql); //sql - 처리객체 생성
			rs = pstmt.executeQuery(); // 검색 - executeQuery()를 사용
			while(rs.next()) { // 다음에 가져올 데이터가 있다면
				Person person = new Person();
				person.setUserId(rs.getString("userid")); //person 테이블에서 userid를 가져와서 person 객체에 저장함
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person); // 사람 객체를 리스트에 저장
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		return personList;
	}
	
	//자료 1개 검색
	public Person getPerson(String userId) {
		Person person = new Person();
		conn = JDBCUtil.getConnection();
		try {
			String sql = "SELECT * FROM person WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
	}
	
	//자료 삭제
	public void deletePerson(String userid) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM person WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//자료 수정
	public void updatePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE person SET userpw = ?,name = ?,age = ?  WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
}
