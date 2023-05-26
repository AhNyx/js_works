package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl rcTv = new Television();
		
		rcTv.turnOn();
		rcTv.setVolume(5);
		rcTv.turnOff();
	}
	

}
