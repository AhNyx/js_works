package ifexample;

import java.util.Scanner;

public class LeafYear {
	public static void main(String[] args) {
		// ������ �Ǻ��ϴ� ���α׷�(������ �Է¹���)
		// 4�� ���� ����, 100�� ������ ������ �ƴϳ�, 400�� ������ ������
		// year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� ");
		int year = scan.nextInt();
		scan.close();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("����Դϴ�");
		}
		
	}
}
