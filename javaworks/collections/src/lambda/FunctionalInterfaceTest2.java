package lambda;

public class FunctionalInterfaceTest2 {

	public static void main(String[] args) {
		//인터페이스형 객체(변수) 선언
		MyFunctionalInterface2 fi;
		
		// 람다식 블록 뒤에 세미콜론을 반드시 찍어야함
		fi = (x) -> { 
			x = x + 10;
			System.out.println(x);
		};
		
		fi.method(5);
		
		fi = (x) -> System.out.println(x * x);
		fi.method(10);
	}
}
