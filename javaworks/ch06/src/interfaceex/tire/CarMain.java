package interfaceex.tire;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("=============================");
		
		//앞바퀴 두개 교체
		myCar.frontLeftTire = new KumTire();
		myCar.frontLeftTire = new KumTire();
	
		myCar.run();
		

	}

}
