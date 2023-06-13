package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;

public class BoardDAO {
	//�ʵ�
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//�Խñ� ���
	public ArrayList<Board> getBoardList(){
		ArrayList<Board> boardList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM t_board ORDER BY regdate DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBnum(rs.getInt("bnum"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("regdate"));
				board.setModifyDate(rs.getTimestamp("modifydate"));
				board.setHit(rs.getInt("hit"));
				board.setMemberId(rs.getString("memberid"));
				
				boardList.add(board);  //���� board ��ü�� �߰� ����
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return boardList;
	}
	
	//�Խñ� ����
	public void addBoard(Board board) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO t_board(bnum, title, content, memberid) "
				+ "VALUES (b_seq.NEXTVAL, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getMemberId());
			pstmt.executeUpdate();  //db�� ����
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//�Խñ� �� ����
	public Board getBoard(int bnum) {
		Board board = new Board();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM t_board WHERE bnum = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);  //�� ��ȣ ���ε� ��Ŵ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board.setBnum(rs.getInt("bnum"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("regdate"));
				board.setModifyDate(rs.getTimestamp("modifydate"));
				board.setHit(rs.getInt("hit"));
				board.setMemberId(rs.getString("memberid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return board;
	}
}






