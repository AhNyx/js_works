package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		/*
		RemoteControl rcTv = new Television();
		
		rcTv.turnOn();
		rcTv.setVolume(5);
		rcTv.setMute(true);
		rcTv.setMute(false);
		rcTv.turnOff();
		RemoteControl.changeBattery();
		*/
		// 오디오
		
		RemoteControl auo = new Audio();
		
		auo.turnOn();
		auo.setVolume(5);
		auo.setMute(true);
		auo.setMute(true);
		auo.turnOff();
		RemoteControl.changeBattery();
	}
	

}
