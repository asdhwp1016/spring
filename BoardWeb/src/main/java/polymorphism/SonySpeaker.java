package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("====> SonySpeaker ��ü ����");
	}
	
	public void volumeUp()
	{
		System.out.println("SonySpeaker -- �Ҹ��� ���δ�");
	}
	
	public void volumeDown()
	{
		System.out.println("SonySpeaker -- �Ҹ��� �����");
	}
	
}
