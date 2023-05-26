package abstractex.phone;

public abstract class Phone { //상속받는 클래스에게 필드, 메소드의 이름을 통일적으로 사용하도록 강제함
	// 필드
	public String owner; //소유주
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void powerOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
