package fruits;

public class Fruit {
	String name;
	String weight;
	int price;
	
	public Fruit() {}
	
	public void showInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}
}
