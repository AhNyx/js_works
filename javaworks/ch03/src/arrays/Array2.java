package arrays;

public class Array2 {
	public static void main(String[] args) {
		
		// ���ڿ��� �迭 ���� �� ���
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//"Sonata"�� �˻��Ͻÿ�
		System.out.println(cars[1]);
		
		//K7�� BMW�� �����Ͻÿ�
		cars[3] = "BMW";
		System.out.println(cars[3]);
		
		//��ü ���
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		//���� for��
		//for(�ڷ��� ���� : �迭�̸�){}
		for(String car : cars) {
			System.out.print(car + " ");
		}
	
		
		
		
		
		
	}
}
