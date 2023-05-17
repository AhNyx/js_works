package ifexample;

public class Switchcase3 {

	public static void main(String[] args) {
		
		String operator = "*";
		int result = 0;
		int num1 = 10;
		int num2 = 10;
		
		
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		System.out.println(result);
						
		
		
		
	}

}
