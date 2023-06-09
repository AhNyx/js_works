package game_level;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메소드
	public final void go(int count) {
		run();
		for(int i=1;i<=count;i++) {
			jump();
		}
		turn();
	}
	
	
}
