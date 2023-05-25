package transport;

public class Vehicle {
	String vehicleName; //차량 이름
	int money; //수입
	int passengerCount; //승객수
	
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public void carry(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 수입은 %d원이고, 승객수는 %d명 입니다.",  vehicleName, money, passengerCount);;
	}
}
