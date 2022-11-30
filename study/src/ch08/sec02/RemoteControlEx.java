package ch08.sec02;

public class RemoteControlEx {

	public static void main(String[] args) {

//		RemoteControl rc; //변수 선언
//		rc = null;// 초기화
		RemoteControl rc = new Television(); //변수 선언 및 초기화 한번에
	
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
