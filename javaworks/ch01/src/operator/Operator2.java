package operator;

public class Operator2 {

	public static void main(String[] args) {
		// �� ���� : >, <, ==, !=
		int num1 = 7, num2 = 3;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		// �� ����
		// && - ���� (�񱳴�� ��� true�̸� true)
		// || - ���� (�񱳴�� �ϳ��� true�̸� true)
		// ! - ������ (�������� true�̸� false)
		
		System.out.println((num1 < num2) && (num1 != num2));
		System.out.println((num1 < num2) || (num1 != num2));
		System.out.println((num1 != num2));
		
		
	}

}
