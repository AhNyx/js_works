package ifexample;

public class Switchcase1 {

	public static void main(String[] args) {
		// switch ~ case�� (������ ���� ������ ������ �ַ� ���)
		// ������ ���� �޴� ���� ���
		int rank = 4;
		String medalColor = "";
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default :
			medalColor = "None";
			break;
		}
		System.out.println(medalColor);
		
		
		
	}

}
