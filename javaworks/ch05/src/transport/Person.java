package transport;

public class Person {
	String name;
	int money;
	
	Person(String name,int money){
		this.name = name;
		this.money = money;
	}
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee;
	}
	
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다\n",name,money);
	}
	
}
