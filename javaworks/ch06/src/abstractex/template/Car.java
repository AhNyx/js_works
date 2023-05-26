package abstractex.template;

public abstract class Car {
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드 정의
	// final이 있으므로 상속 받은 클래스에서 메소드를 재정의할수 없다
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
