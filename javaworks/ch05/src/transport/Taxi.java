package transport;

public class Taxi extends Vehicle{

	public Taxi(String vehicleName) {
		super(vehicleName);
	}

	@Override
	public void carry(int money) {
		if(money < 4800) System.out.println("기본 요금은 4800원 입니다.");
		else super.carry(money);
	}
	
	
	
	
	
	
	
}
