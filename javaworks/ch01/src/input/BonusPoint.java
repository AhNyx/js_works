package input;

import java.util.Scanner;

public class BonusPoint {
	
	public static void main(String[] args) {
		
		// ���� ���� ����Ʈ ��� ���α׷�
		// ���ʽ� ����Ʈ = ���� X ���ʽ�������
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		System.out.print("���� �ݾ��� �Է��ϼ���: ");
		int price = sc.nextInt();
		int bonusPoint = 0;
		double bonusRatio = 0.05;
		
		//int �� < double��
		bonusPoint = (int)(price * bonusRatio);
		
		System.out.printf("%s���� ���ʽ� ����Ʈ�� %d���Դϴ�", name , bonusPoint);
		
		sc.close();
	
	}
}
