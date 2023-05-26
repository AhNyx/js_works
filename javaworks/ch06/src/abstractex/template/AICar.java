package abstractex.template;

public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 자율주행 합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	
	
}
