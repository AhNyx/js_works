package interfaceex.tire;

public class Car {
	
	Tire frontLeftTire = new HanTire();
	Tire fontRifhtfire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	
	public void run() {
		frontLeftTire.roll();
		frontLeftTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
	
	
}
