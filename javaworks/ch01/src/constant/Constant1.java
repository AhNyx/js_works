package constant;

public class Constant1 {

	public static void main(String[] args) {
		// ��� �����ϱ� - final Ű����
		// ����� ������ �� ���� (���Ҵ� �ȵ�)
		final int MAX_NUM = 100;
		
		System.out.println(MAX_NUM);
		
		// ��� Ȱ���ϱ� - ���� ���� ���
		int radius = 5;
		final double PI = 3.14;
		double area;
		
		area = radius * radius * PI;
		
		System.out.printf("���� ���̴� %.2f�Դϴ�", area);
	}

}
