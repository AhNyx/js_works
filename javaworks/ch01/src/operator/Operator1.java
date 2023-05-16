package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 영어, 수학과목의 총점과 평균
		// 변수(입력)
		int engScore = 90;
		int mathScore = 85;
		int totalScore; 
		double avgScore;
		
		// 총점과 평균 계산
		totalScore = engScore + mathScore;
		//int로 연산하면 int형이 되므로 자료의 손실이 생김, (double)로 형변환
		avgScore = (double)totalScore / 2;
		// 출력
		System.out.println("총점 : "+ totalScore);
		System.out.println("평균 : "+ avgScore);
		
		//++연산자 - 1증가, --연산자 - 1감소
		//++가 뒤에 사용 - 후치연산, 앞에 사용 - 전치 연산
		int num = 10;
		int val = 0;
		//val = num++; // 계산 순서 1.num을 val에 저장, 2.num=num+1 증가
		val = num++;
		//val = ++num; // 계산순서 2.num=num+1 1증가, 2.num을 val에 저장
		
		System.out.println(val);
		System.out.println(num);
		
		
	}

}
