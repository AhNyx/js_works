package game_level;

public class Beginner extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump할줄 모름");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn할줄 모름");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("************초보자 레벨입니다**************");
	}
	

}
