package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// ���尴 ���� ���� ���� �ټ� ����ϱ�
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
		
		
		

		System.out.println(rowNum + "���� ���� �ʿ��մϴ�.");
	}

}
