package whileexample;

public class While1 {

	public static void main(String[] args) {
		// while �ݺ���
		// 1���� 10���� ���
		int i = 0;
		int sumVal = 0; //�հ� ���� ����
		while(i<10) {
			i++;
			sumVal += i;
			System.out.println(i);
		}
		System.out.println(sumVal);
	}

}
