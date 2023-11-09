package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker()
	{
		System.out.println("===> ApplerSpeaker ��ü ����");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- �Ҹ��� �ø���");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- �Ҹ��� �����");
		
	}

}
