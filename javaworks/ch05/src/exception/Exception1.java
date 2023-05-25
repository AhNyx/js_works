package exception;

public class Exception1 {
	
	public static void main(String[] args) {
		// NullPointerException
		String data = null;
		//data의 정보를 문자열로 출력하는 메소
		//data.toString();
		
		// NumberFormatException - 숫자 형식이 아닐때 발생 예외
		String data2 = "a200";
		
		int value = Integer.parseInt(data2);
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
	}
}
