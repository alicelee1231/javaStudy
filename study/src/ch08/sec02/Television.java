package ch08.sec02;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if ( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨 :" + this.volume);
	}

	@Override
	public int getVolume() {
		return this.volume;
	}
	
	

	
	
	
}
