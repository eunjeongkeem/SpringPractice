package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") //bean 등록과 같은 의미 ???????
public class LgTV implements Tv {
	@Autowired //speaker를 가르키는 bean이 있으면 자동으로 넣어줌 ?
	@Qualifier("appleSpeaker")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 객체화!!!");
	}
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원 켬");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원 끔");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
}
