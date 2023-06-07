package gugudan;

public class GuguBean {
	//������ ��� �� ���� �迭�� ó���ϴ� �ż���
	public int[] times(int dan) {
		int[] gugu = new int[19]; //19�� ������ ������ �迭 ����
		
		for(int i = 1; i < gugu.length + 1; i++) {
			gugu[i-1] = dan * i; //dan=2�� ��� gugu[0] = 2*1
		}
	
		return gugu;  //�迭�� ��ȯ(������)
	}
}
