package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;

import banking.bankarray.Account;

public class BankArrayList {
	// 통장 계좌를 만들 ArrayList 생성
	static ArrayList<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);		
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			// 메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount(); //계좌 생성
			} 
			else if (selectNo == 2) {
				getAccountList(); //계좌 목록
			} 
			else if (selectNo == 3) {
				deposit(); //계좌 목록
			}
			else if (selectNo == 4) {
				withdraw(); //출금
			}
			else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			} 
			else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
			}
		} // while() 끝
		
	} // Main() 끝





	//계좌를 생성하는 함수
	private static void createAccount() {
		while(true){
			boolean check = true;
			System.out.println("------------------------------------------");
			System.out.println("계좌생성");
			System.out.println("------------------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();

			for(int i=0; i<accountList.size(); i++) {
				if(accountList.get(i) != null) {
					if(accountList.get(i).getAno().equals(ano)) {
						System.out.println("중복 계좌입니다 다시 입력해주세요");
						check = false;
						break;
					}
				}
			}
			
			if(check) {
				System.out.print("계좌주: ");
				String owner = scanner.nextLine();
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				//첫번째 계좌 생성
				//accountArray[0] = new Account(ano, owner, balance);
				accountList.add(new Account(ano, owner, balance));
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
				}

			}
		}
	
	private static void getAccountList() {
		//Account account = accountArray[0]; // 출력할 계좌 저장
		for(int i=0; i<accountList.size(); i++) { // 전체 배열을 반복하면서 계좌를 생성함
				System.out.print("계좌번호 : " + accountList.get(i).getAno() + "\t");
				System.out.print("계좌주 : " + accountList.get(i).getOwner() + "\t");
				System.out.println("잔액 : " + accountList.get(i).getBalance());
		}
	}
	
	// 계좌를 검색하는 메소드
	private static Account findAccount(String ano) {
		Account account = null; // 빈 계좌 계정을 할당
		
		for(int i=0;i<accountList.size();i++) {
			String dbAno = accountList.get(i).getAno(); // 이미 저장된 계정				
			if(dbAno.equals(ano)) { // 찾는 계좌와 일치하면 문자열 비교 - equals() 사용
				account = accountList.get(i);// 계좌를 가져와 저장
				break; // 빠져나옴
			}
		}
		return account;
	}
	
	//계좌에 입금하는 메소드
	private static void deposit() {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("예금");
			System.out.println("------------------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				// 예금 = 잔고 + 예금액
				Account account = findAccount(ano);
				account.setBalance(account.getBalance() + money);
				System.out.println("결과 : 정상처리 되었습니다.");
				break;
			} else {
				System.out.println("계좌가 없습니다.");
			}
		}
	}
	
	private static void withdraw() {
		while(true) {
			boolean check = true;
			System.out.println("------------------------------------------");
			System.out.println("출금");
			System.out.println("------------------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
		
			System.out.print("출금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			

			if(findAccount(ano) != null && findAccount(ano).getBalance() < money) {
				System.out.println("잔액이 부족합니다. 다시 입력해주세요");
				check = false;
			}
			
			if(check) {
				if(findAccount(ano) != null) {
					Account account = findAccount(ano);
					account.setBalance(account.getBalance() - money);
					System.out.println("결과 : 정상처리 되었습니다.");
				} else {
					System.out.println("계좌가 없습니다.");
				}
				break;
			}
		}

	}
	
	
}// Main 클래스 끝
