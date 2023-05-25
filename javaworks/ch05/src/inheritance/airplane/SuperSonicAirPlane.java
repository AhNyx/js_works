package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	//비행 모드 1-일반비행, 2-초음속비행
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속비행 합니다.");
		}
		else { // 메소드 상속 받음
			super.fly();
		}
	}

}
