package whileexample;

public class While2 {
	public static void main(String[] args) {
		// while�� - �ݺ����ǹ�(if~ break)
		int i = 0;
		int sumVal = 0;
		
		while(true) {
			i++;
			if(i > 10) {
				break;
			}
			sumVal += i;
			System.out.println(i);
		}
		System.out.println("�հ�: " + sumVal);
	}
}
