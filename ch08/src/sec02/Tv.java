package sec02;

public class Tv implements RemoteControl  // �������̽��� �߻� �޼��� ����
{

	@Override   //�������̵� ���� �������
	public void turnOn()  // public�� ���� ���� �߻� �������̽����� �޼��尡 �⺻ public�̱� ��
	{
		System.out.println("TV ����Ϳ� ������ ���ɴϴ�");
		System.out.println("TV �⺻ ä�� 5���� �����ݴϴ�");
		
	}

	@Override
	public void turnOff()
	{
		System.out.println("TV ����Ϳ� ������ �����ϴ�");
		
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
		System.out.println("TV ������ " + volume + "���� �����մϴ�");
	}
	
}
