package shelf;

public interface Queue {
	
	void enQueue(String title); // 리스트의 맨 마지막에 추가
	
	String deQueue(); // 리스트의 맨 처음 항목 반환(0번 인덱스)
	
	int getSize(); // 현재 큐에 있는 자료의 개수
}
