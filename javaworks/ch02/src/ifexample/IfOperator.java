package ifexample;

public class IfOperator {
	public static void main(String[] args) {
		
		String operator = "+";
		int num1 = 10;
		int num2 = 10;
		int result = 0;
		
		if(operator.equals("+")) {
			result = num1 + num2;
		} 
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
		System.out.println(result);
	}
}
