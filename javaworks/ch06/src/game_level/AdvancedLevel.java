package game_level;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 점프합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn할줄 모름");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("************중급자 레벨입니다**************");
	}
	

}
