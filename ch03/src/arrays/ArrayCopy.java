package arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		//�迭�� ����
		//1. ���� �迭�� �ڷ��� �� �迭 ũ�Ⱑ �Ȱ��� �迭�� ���� ���鶧
		//2. �迭�� ��� ��ҿ� �ڷᰡ �� ���� �� ū �迭�� ���鶧
		
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// 2. clone() �޼ҵ� ���

		int[] arr3 = new int[5];
		arr3 = arr1.clone();
		for(int i : arr3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] arr4 = new int[5];
		//3. System Ŭ������ arraycopy() �޼ҵ� ���
		System.arraycopy(arr1, 0, arr4, 0, 5);
		
		for(int i : arr4) System.out.print(i + " ");
	}
}
