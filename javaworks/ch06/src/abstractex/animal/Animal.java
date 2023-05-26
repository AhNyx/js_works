package abstractex.animal;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	// 선언부만 있고 구현부가 없다.
	public abstract void sound();
	
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind + "입니다.");
	}
}
