package ifexample;

import java.util.Scanner;

public class SeatLayout {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int customer; //���尴 �� ����
		int colNum; //�¼� �� �� ����
		int rowNum; //��(��)�� �� ����
		
		System.out.println("���尴 �� �Է� : ");
		customer = sc.nextInt();
		
		System.out.println("�¼� �� �� �Է� : ");
		colNum = sc.nextInt();
		//���� ó�� (���ǹ�)
		
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
