package sec02;

public class Example
{

	public static void main(String[] args)
	{
		RemoteControl rc = new Radio();   //implements �� �پ��ִ°��̶�� ��� ���� ��ü�� �����ؼ� ���� �� �ִ� . Tv ��ü �Ǵ� Radio  (������� ������ ����� �ٸ���) -> ������
		rc.turnOn();    // 
		rc.turnOff();
		rc.setVolume(5);

	}

}
