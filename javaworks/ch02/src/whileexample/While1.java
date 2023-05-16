package whileexample;

public class While1 {

	public static void main(String[] args) {
		// while 반복문
		// 1부터 10까지 출력
		int i = 0;
		int sumVal = 0; //합계 저장 변수
		while(i<10) {
			i++;
			sumVal += i;
			System.out.println(i);
		}
		System.out.println(sumVal);
	}

}
