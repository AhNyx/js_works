package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTV stv = new SmartTV();
		stv.setVolume(8);
		RemoteControl.changeBattery();
		stv.turnOff();
		RemoteControl rc = stv;
		Searchable searchable = stv;
		
		searchable.search("www.naver.com");
		
		
		rc.turnOn();
		rc.turnOff();
		
		
	}

}
