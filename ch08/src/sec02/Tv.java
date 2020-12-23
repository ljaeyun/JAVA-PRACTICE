package sec02;

public class Tv implements RemoteControl  // 인터페이스의 추상 메서드 구현
{

	@Override   //오버라이드 빼도 상관없다
	public void turnOn()  // public을 빼면 에러 발생 인터페이스에서 메서드가 기본 public이기 문
	{
		System.out.println("TV 모니터에 전원이 들어옵니다");
		System.out.println("TV 기본 채녈 5번을 보여줍니다");
		
	}

	@Override
	public void turnOff()
	{
		System.out.println("TV 모니터에 전원이 꺼집니다");
		
	}

	@Override
	public void setVolume(int volume)
	{
		if(volume > RemoteControl.MAX_VOLUM)
		{
			volume = RemoteControl.MAX_VOLUM;
		}
		
		if(volume < RemoteControl.MIN_VOLUM)
		{
			volume = RemoteControl.MIN_VOLUM;
		}
		System.out.println("TV 볼륨을 " + volume + "으로 변경합니다");
	}
	
}
