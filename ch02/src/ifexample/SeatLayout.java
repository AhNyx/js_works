package ifexample;

import java.util.Scanner;

public class SeatLayout {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int customer; //입장객 수 저장
		int colNum; //좌석 열 수 저장
		int rowNum; //줄(행)의 수 저장
		
		System.out.println("입장객 수 입력 : ");
		customer = sc.nextInt();
		
		System.out.println("좌석 열 수 입력 : ");
		colNum = sc.nextInt();
		//연산 처리 (조건문)
		
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		} else {
			rowNum = (int)(customer / colNum) + 1;
		}
		
		
		for(int i=0;i<rowNum; i++) {
			for(int j=1;j<=colNum;j++) {
				int num = colNum*i+j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
