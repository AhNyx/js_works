package whileexample;

import java.util.Scanner;

public class KeyRepeat {
	
	public static void main(String[] args) {
		// 'y'Ű - ��ӹݺ�, 'n'Ű - �ݺ��ߴ�, �̿��� Ű - "�������� �ʴ� Ű�Դϴ�"
		// key == 'y'(�� �ȵ�), ���ڿ��� equals() �޼ҵ� ���
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("��� �ݺ��ұ��?(y/n) ");
			String key = sc.nextLine();
			
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("��� �ݺ�");
			} else if(key.equals("n") || key.equals("N")) {
				System.out.println("�ݺ� �ߴ�");
				break;
			} else {
				System.out.println("�������� �ʴ� Ű�Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
