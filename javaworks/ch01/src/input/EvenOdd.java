package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int num = 0;
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
			String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
			System.out.println(result);
		}catch(Exception e){
			System.out.println("���ڸ� �Է����ּ���");
		}
	}

}
