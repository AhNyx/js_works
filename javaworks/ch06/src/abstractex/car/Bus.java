package abstractex.car;

public class Bus extends Car{

	public void takePassenger() {
		System.out.println("버스가 승객을 태웁니다.");
	}
	
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
	}
	
}
