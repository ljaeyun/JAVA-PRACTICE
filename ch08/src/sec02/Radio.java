package sec02;

public class Radio implements RemoteControl  // �������̽��� �߻� �޼��� ����
{

	@Override
	public void turnOn()
	{
		System.out.println("Radio ����Ϳ� ������ ���ɴϴ�");
		System.out.println("Radio �⺻ ä�� 5���� �����ݴϴ�");
		
	}

	@Override
	public void turnOff()
	{
		System.out.println("Radio ����Ϳ� ������ �����ϴ�");
		
	}

	@Override
	public void setVolume(int volume)
	{
		System.out.println("Radio ������ " + volume + "���� �����մϴ�");
		
		
	}
	
}
