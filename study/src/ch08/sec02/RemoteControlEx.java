package ch08.sec02;

public class RemoteControlEx {

	public static void main(String[] args) {

		
		
//		RemoteControl rc; //변수 선언
//		rc = null;// 초기화
		RemoteControl rc; 
		rc = new Television(); //변수 선언 및 초기화 한번에
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재볼륨: " + rc.getVolume());
		
		rc = new Audio();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재 볼륨:" + rc.getVolume() );
		
	}
  
}
