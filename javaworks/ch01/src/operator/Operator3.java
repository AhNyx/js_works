package operator;

public class Operator3 {

	public static void main(String[] args) {
		// ���� ������ - �񱳹� ? �� : ����
		boolean bool = (5 > 3) ? true : false;
		//char ch = (5 > 3) ? 'T' : 'F';
		System.out.println(bool);
		//System.out.println(ch);
		
		//�θ���� ���� ��
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
	}

}
