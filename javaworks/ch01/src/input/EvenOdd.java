package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int num = 0;
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
			String result = (num % 2 == 0) ? "짝수" : "홀수";
			System.out.println(result);
		}catch(Exception e){
			System.out.println("숫자를 입력해주세요");
		}
	}

}
