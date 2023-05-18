package ifexample;

import java.util.Scanner;

public class Bank1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
			int balance = 0; // 은행 잔고
			boolean run = true; //상태 // 실행변수
			int money = 0;
			
			int selNum = Integer.parseInt(sc.nextLine()); 
			System.out.println("=====================");
			System.out.println("1.예금|2.출금|3.잔고.|4종료");
			System.out.println("=====================");
			switch(selNum){
				case 1:
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%,d원 정상 처리되었습니다", money);
					break;
				case 2:
					money = Integer.parseInt(sc.nextLine());
					balance -= money;
					System.out.printf("%,d원 정상 처리되었습니다", money);
					break;
				case 3:
					System.out.println("잔고 >" + balance);
				case 4:
					run = false;
					break;
				default:
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시  입력해주세요");
					break;
		}
	} 
}
