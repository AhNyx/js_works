package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;
import banking.banking_db.common.JDBCUtil;

public class AccountDao {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	
	static Scanner scanner = new Scanner(System.in);	
	
	// 계좌 생성
	public void createAccount() {

				System.out.println("------------------------------------------");
				System.out.println("계좌생성");
				System.out.println("------------------------------------------");
				
			while(true) {
				System.out.print("계좌번호: ");
				String ano = scanner.nextLine();
				
				if(findAccount(ano) != null) {					
					System.out.println("중복 계좌입니다 다시 입력해주세요");
				} else {
					System.out.print("계좌주: ");
					String owner = scanner.nextLine();

					System.out.print("초기입금액: ");
					int balance = Integer.parseInt(scanner.nextLine());
					
					conn = JDBCUtil.getConnection();
					
					String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
					
					try {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						pstmt.setString(2, owner);
						pstmt.setInt(3, balance);
						pstmt.executeUpdate();
						System.out.println("계좌가 생성되었습니다.");
					} catch(SQLException e) {
						e.printStackTrace();
					} finally {
						JDBCUtil.close(conn, pstmt);
					}
					break;
				}

			}

	}
		
	public void getAccountList() {
		
		ArrayList<Account> accountList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { // 자료가 있으면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			for(int i=0;i<accountList.size();i++) {
				Account account = accountList.get(i);
				System.out.print("계좌번호 : " + account.getAno() + "\t");
				System.out.print("계좌주 : " + account.getOwner() + "\t");
				System.out.println("잔액 : " + account.getBalance());
			}
		} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
			
		}
		
	}
		
		// 계좌를 검색하는 메소드
	public Account findAccount(String ano) {
		Account account = null; // 빈 계좌 계정을 할당
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;

		
		

			

//			for(int i=0;i<accountList.size();i++) {
//				String dbAno = accountList.get(i).getAno(); // 이미 저장된 계정				
//				if(dbAno.equals(ano)) { // 찾는 계좌와 일치하면 문자열 비교 - equals() 사용
//					account = accountList.get(i);// 계좌를 가져와 저장
//					break; // 빠져나옴
//				}
//			}

		}
		
		//계좌에 입금하는 메소드
	public void deposit() {
			while(true) {
				System.out.println("------------------------------------------");
				System.out.println("예금");
				System.out.println("------------------------------------------");
				
				System.out.print("계좌번호: ");
				String ano = scanner.nextLine();
				
				if(findAccount(ano) != null) {
					System.out.print("입금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					Account account = findAccount(ano);
					String owner = account.getOwner(); //입력한 계좌를 가져옴
					
					int balance = account.getBalance() + money;		// 예금 = 잔고 + 예금액
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
					try {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, owner);
						pstmt.setInt(2, balance);
						pstmt.setString(3, ano);
						pstmt.executeUpdate();
						System.out.printf("%,d 원 정상 입금 되었습니다.\n", money);
						
					} catch (SQLException e) {
						e.printStackTrace();
					}	finally {
						JDBCUtil.close(conn, pstmt);					
					}
					break;
				} else {
					System.out.println("계좌가 없습니다.");
				}
			}
		}
		
	public void withdraw() {
	System.out.println("-------------------------------------------");
	System.out.println("출금");
	System.out.println("-------------------------------------------");
	
	while(true) {
		System.out.print("계좌번호:  ");
		String ano = scanner.nextLine();
		
		if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
			while(true) {
				System.out.print("출금액:  ");
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano);
				
				
				if(money > account.getBalance()) { //출금액이 잔고를 초과한다면
					System.out.println("잔액이 부족합니다. 다시 입력해 주세요");
				}else {
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
					try {	
						String owner = account.getOwner();
						int balance = account.getBalance() - money;
						
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, owner);
						pstmt.setInt(2, balance);
						pstmt.setString(3, ano);
						pstmt.executeUpdate();
						System.out.printf("%,d원 정상 출금되었습니다.\n", money);
						
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						JDBCUtil.close(conn, pstmt);
					}
					//출금 = 잔고 - 예금액
					account.setBalance(account.getBalance() - money);
					break;  //출금 처리후 빠져나옴
				}
			}//내부 while 끝
			break; //정상 처리후 빠져나옴
		}else {
			System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
		}
	}//외부 while 끝
}
	
	
	public void deleteAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌삭제");
		System.out.println("-------------------------------------------");
		
		System.out.print("계좌번호:  ");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		
		if(findAccount(ano) != null) {
			conn = JDBCUtil.getConnection();
			String sql = "DELETE FROM account WHERE ano = ?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, account.getAno());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(conn, pstmt);
			}
			System.out.println("결과: 정상 처리 되었습니다.");
			
		} else {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
	}
}
