package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		
		int x = 10;
		int y = 0;
		System.out.println(calc.add(x, y));
		System.out.println(calc.subtract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.divide(x, y));
		
	}

}
