package forexample;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		int sumV = 0;
		
		for(int i=1;i<=10;i++) {
			sumV += i;
			System.out.println("i=" + i + ", sum=" + sumV);
		}
		System.out.println("합계 =" + sumV);
		
		
		// 문자 세트 - 알파벳 출력 (대문자 , 소문자)
		char ch;
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		//유니 코드 한글
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		//구구단
		System.out.println();
		System.out.println("단 수를 입력");
		int dan = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(dan+"*"+ i+"="+dan*i);
		}
		sc.close();
	}
	
}
