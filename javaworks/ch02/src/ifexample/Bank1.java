package ifexample;

import java.util.Scanner;

public class Bank1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
			int balance = 0; // ���� �ܰ�
			boolean run = true; //���� // ���ຯ��
			int money = 0;
			
			int selNum = Integer.parseInt(sc.nextLine()); 
			System.out.println("=====================");
			System.out.println("1.����|2.���|3.�ܰ�.|4����");
			System.out.println("=====================");
			switch(selNum){
				case 1:
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%,d�� ���� ó���Ǿ����ϴ�", money);
					break;
				case 2:
					money = Integer.parseInt(sc.nextLine());
					balance -= money;
					System.out.printf("%,d�� ���� ó���Ǿ����ϴ�", money);
					break;
				case 3:
					System.out.println("�ܰ� >" + balance);
				case 4:
					run = false;
					break;
				default:
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ�  �Է����ּ���");
					break;
		}
	} 
}
