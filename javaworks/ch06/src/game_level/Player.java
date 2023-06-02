package game_level;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	//showLevelMessge) 를 변경하는 메소드(매개변수의 다형성)
	
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
