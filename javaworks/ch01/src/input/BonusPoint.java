package input;

import java.util.Scanner;

public class BonusPoint {
	
	public static void main(String[] args) {
		
		// 고객의 구매 포인트 계산 프로그램
		// 보너스 포인트 = 가격 X 보너스적립율
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("구매 금액을 입력하세요: ");
		int price = sc.nextInt();
		int bonusPoint = 0;
		double bonusRatio = 0.05;
		
		//int 형 < double형
		bonusPoint = (int)(price * bonusRatio);
		
		System.out.printf("%s님의 보너스 포인트는 %d점입니다", name , bonusPoint);
		
		sc.close();
	
	}
}
