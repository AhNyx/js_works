package input;

import java.util.Scanner;

public class input1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("당신의 이름은 무엇입니까?");
		String name = scan.nextLine();
		
		System.out.println("당신의 이름은"+name+"이군요!");
	 	System.out.println("당신의 나이는 몇 세 입니까?");
	 	int age = scan.nextInt();
	 	System.out.println("당신의 나이는" + age + "세 이군요!");
	 	scan.close();
	 			
	}

}
