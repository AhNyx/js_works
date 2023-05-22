package twodimention;

public class TwoDimention2 {
	
	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char[5][5];
	
	
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for(int i=0;i<a.length; i++) {
			for(int j=0; j<a[i].length-i; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}


		int[][] arr = new int [4][5];
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//(열의 종료값 * 행의 값) + (j + 1)
				arr[i][j] = (arr[i].length*i) + (j + 1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
		
		
		
	}
}
