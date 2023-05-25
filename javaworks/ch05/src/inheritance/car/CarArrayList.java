package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {
	public static void main(String[] args) {
		// 자동차 3대 생성 - ArrayList에 저장
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("car1",1));
		carList.add(new Car("car2",2));
		carList.add(new Car("car3",3));
		
		for(int i=0;i<carList.size();i++) {
			System.out.println(carList.get(i).carInfo());
		}
		
		
		
		
	}
	
}
