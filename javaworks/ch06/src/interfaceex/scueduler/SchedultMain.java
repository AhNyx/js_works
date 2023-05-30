package interfaceex.scueduler;

import java.io.IOException;

public class SchedultMain {

	public static void main(String[] args) throws IOException {
		// 입력 방식 - System.in.read()
		System.out.println("전화 상담 배분 방식을선택하세요.");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 현재 상담업무가 없거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객 먼저 할당");
		int ch = System.in.read(); //read() 반환값이 int형이므로 char쓰지 않음
		
		Schedulr scheduler = null;
		
		if(ch == 'R') {
			scheduler = new RoundRobin();
		} else if (ch == 'L') {
			scheduler = new LeastJob();
		} else if (ch == 'P') {
			scheduler = new PriorityAllocation();
		}
		
		// TODO Auto-generated method stub
		
		scheduler.getNextCall();
		scheduler.sendCallToAgnet();
		
	}
}
