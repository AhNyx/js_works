package operator;

public class PrintFormat {
	
	public static void main(String[] args) {
		//printf("���ڿ� ����", ��ü) �Լ�
		//���� ���� - %d : ����, %f - �Ǽ�, %s - ���ڿ�
		//�̽������� ���� - \n : �ٹٲ�, \t : ��
		
		
		int year = 2022;
		System.out.println("���ش� " + year + "�� �Դϴ�");
		System.out.printf("���ش� %d�� �Դϴ�.", year);
		System.out.println("\n-------------------");
		
		String nick = "���� ����";
		System.out.printf("�׳��� ������ %s �Դϴ�", nick);
		System.out.println();
		
		String table = "";
		table += "-------------------\n";
		table += "�̸�\t����\t����\n";
		table += "������\t82\t���\n";
		table += "�̼���\t52\t����\n";
		table += "-------------------\n";
		
		System.out.println(table);
		
	}
}
