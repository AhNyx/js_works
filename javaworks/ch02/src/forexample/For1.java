package forexample;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		// 1���� 10���� ���, �հ�
		int sumV = 0;
		
		for(int i=1;i<=10;i++) {
			sumV += i;
			System.out.println("i=" + i + ", sum=" + sumV);
		}
		System.out.println("�հ� =" + sumV);
		
		
		// ���� ��Ʈ - ���ĺ� ��� (�빮�� , �ҹ���)
		char ch;
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		//���� �ڵ� �ѱ�
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		//������
		System.out.println();
		System.out.println("�� ���� �Է�");
		int dan = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+ i+"="+dan*i);
		}
		sc.close();
	}
	
}
