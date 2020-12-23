package sec02;

public class Radio implements RemoteControl  // 인터페이스의 추상 메서드 구현
{

	@Override
	public void turnOn()
	{
		System.out.println("Radio 모니터에 전원이 들어옵니다");
		System.out.println("Radio 기본 채녈 5번을 보여줍니다");
		
	}

	@Override
	public void turnOff()
	{
		System.out.println("Radio 모니터에 전원이 꺼집니다");
		
	}

	@Override
	public void setVolume(int volume)
	{
		System.out.println("Radio 볼륨을 " + volume + "으로 변경합니다");
		
		
	}
	
}
