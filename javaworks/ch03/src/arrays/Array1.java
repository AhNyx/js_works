package arrays;

public class Array1 {
	
	
	
	public static void main(String[] args) {
		// 정수 5개를 저장할 배열 선언
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println("배열의 길이(크기): " + arr.length);
		System.out.println(arr[0]);
		
		arr[2] = 7;
		
		//배열의 요소 전체 출력
		for(int i = 0;i<5;i++) {
			System.out.println(arr[i]+ " ");
		}
		//5개의 크기를 가진 정수형 배열 선언
		int[] arr2 = {2, 4, 6, 8, 10};
		
		//4번 인덱스의 값을 100으로 변경
		arr2[4] = 100;
		
		System.out.println(arr2[1]);
		
		//전체 출력
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		
		
	}
	
}	
