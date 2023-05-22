package twodimention;

import java.util.Scanner;

public class SeatArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int customer; 
		int colNum; 
		int rowNum;
		
		System.out.println("입장객 수를 입력하세요 : ");
		customer = sc.nextInt();
		
		System.out.println("열의 수를 입력하세요: ");
		colNum = sc.nextInt();
		//���� ó�� (���ǹ�)
		
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		} else {
			rowNum = (int)(customer / colNum) + 1;
		}
		
		
		int[][] arr = new int [rowNum][colNum];
		
		for(int i=0;i<rowNum; i++) {
			for(int j=0; j<colNum; j++) {
				arr[i][j] = (colNum*i) + (j + 1);
				if(arr[i][j] > customer) break;
				System.out.print("좌석 " + arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
