package lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		
		// 변수 선언
		MyNumber num;
		
		// 람다식
		
		num = (x, y) -> {
			return (x >= y) ? x : y;
		};
		
		num = (x , y) -> (x >= y) ? x : y;
		
		int result = num.getMax(10, 8);
		System.out.println(result);
		
	}

}
