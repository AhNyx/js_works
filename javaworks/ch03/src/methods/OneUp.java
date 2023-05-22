package methods;

public class OneUp {

	//숫자 1 증가 함수
	public static int oneUp() {
		int x = 0;
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());  //1
		System.out.println(oneUp());  //1
		System.out.println(oneUp());  //1
		
		//System.out.println(x); x가 정의되지 않아서 컴파일 오류
	}

}
