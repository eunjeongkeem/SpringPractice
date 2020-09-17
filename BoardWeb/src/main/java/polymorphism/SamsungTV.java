package polymorphism;

public class SamsungTV implements Tv {
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체화 !!!");
	}
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켬");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끔");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
