package arrays;

public class Array1 {
	
	
	
	public static void main(String[] args) {
		// ���� 5���� ������ �迭 ����
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println("�迭�� ����(ũ��): " + arr.length);
		System.out.println(arr[0]);
		
		arr[2] = 7;
		
		//�迭�� ��� ��ü ���
		for(int i = 0;i<5;i++) {
			System.out.println(arr[i]+ " ");
		}
		//5���� ũ�⸦ ���� ������ �迭 ����
		int[] arr2 = {2, 4, 6, 8, 10};
		
		//4�� �ε����� ���� 100���� ����
		arr2[4] = 100;
		
		System.out.println(arr2[1]);
		
		//��ü ���
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		
		
	}
	
}	
