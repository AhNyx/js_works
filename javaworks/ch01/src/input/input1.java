package input;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("����� �̸��� �����Դϱ�?");
		String name = scan.nextLine();
		
		System.out.println("����� �̸���"+name+"�̱���!");
	 	System.out.println("����� ���̴� �� �� �Դϱ�?");
	 	int age = scan.nextInt();
	 	System.out.println("����� ���̴�" + age + "�� �̱���!");
	 	scan.close();
	 			
	}

}
