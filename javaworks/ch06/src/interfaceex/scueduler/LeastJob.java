package interfaceex.scueduler;

public class LeastJob implements Schedulr {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
	}

	@Override
	public void sendCallToAgnet() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 배분합니다");
	}
	
}
