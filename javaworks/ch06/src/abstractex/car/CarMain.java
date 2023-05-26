package abstractex.car;

public class CarMain {
	
	public static void main(String[] args) {
		//부모 타입으로 bus객체 생성
		Car car = new Bus();
		car.run();
		car.refuel();
		
		if(car instanceof Bus) {
			Bus bus = (Bus)car;
			bus.takePassenger();
		}
		
		
		Car car2 = new Truck();
		car2.run();
		car2.refuel();
		if(car2 instanceof Truck) {
			Truck truck = (Truck)car2;
			truck.load();
		}
		
		
	}
}
