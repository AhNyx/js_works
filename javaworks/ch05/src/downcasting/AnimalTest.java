package downcasting;

import java.util.ArrayList;


class Animal{
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다");
	}
}

class Human extends Animal{
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다");
	}
	
}

class Tiger extends Animal{
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{
	public void breathe() {
		System.out.println("독수리가 숨을 쉽니다");
	}
	
	public void fly() {
		System.out.println("독수리가 하늘을 날아갑니다");
	}
}

public class AnimalTest {

	static ArrayList<Animal> animalList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//생성된 객체를 arrayList에 저장
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		testCasting();
		
//		Animal animal = new Human();
//		animal.breathe();
//		
//		if(animal instanceof Human) { // animal이 Human의 인스턴스라면
//			Human man = (Human)animal; //강제 형변환 실행
//			man.read();
//		}
		
	}
	
	public static void testCasting() {
		for(int i=0;i<animalList.size();i++) {
			//다형성 - 부모 타입으로 객체 생성
			Animal animal = animalList.get(i);
			animal.breathe();
			//하위 클래스의 메소드 사용
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.fly();
			} else {
				System.out.println("지원하지 않는 타입");
			}
			
		}
		
		
		
	}

}
