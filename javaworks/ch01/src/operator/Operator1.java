package operator;

public class Operator1 {

	public static void main(String[] args) {
		// ����, ���а����� ������ ���
		// ����(�Է�)
		int engScore = 90;
		int mathScore = 85;
		int totalScore; 
		double avgScore;
		
		// ������ ��� ���
		totalScore = engScore + mathScore;
		//int�� �����ϸ� int���� �ǹǷ� �ڷ��� �ս��� ����, (double)�� ����ȯ
		avgScore = (double)totalScore / 2;
		// ���
		System.out.println("���� : "+ totalScore);
		System.out.println("��� : "+ avgScore);
		
		//++������ - 1����, --������ - 1����
		//++�� �ڿ� ��� - ��ġ����, �տ� ��� - ��ġ ����
		int num = 10;
		int val = 0;
		//val = num++; // ��� ���� 1.num�� val�� ����, 2.num=num+1 ����
		val = num++;
		//val = ++num; // ������ 2.num=num+1 1����, 2.num�� val�� ����
		
		System.out.println(val);
		System.out.println(num);
		
		
	}

}
