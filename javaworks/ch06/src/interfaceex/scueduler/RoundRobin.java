package interfaceex.scueduler;


public class RoundRobin implements Schedulr{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
		
	}

	@Override	
	public void sendCallToAgnet() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
	


}
