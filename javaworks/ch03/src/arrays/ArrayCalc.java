package arrays;

public class ArrayCalc {
	public static void main(String[] args) {
		// �迭�� ������ ���
		int[] score = new int[4];
		
		// 90, 70, 85, 60 �Է�
		score[0] = 90;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;
	
		//���� ���
		int total = 0;
		
		for(int i=0;i<score.length;i++) {
			total += score[i];
			System.out.print(total + " ");
		}
		System.out.println();
		System.out.println(total);
	}
}
