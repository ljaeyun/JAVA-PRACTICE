package sec03.exam02;

public class PassengerPlane implements Flyable, Sailable
{

	@Override
	public void land()
	{
		System.out.println("�����Ⱑ �����մϴ�");
		
	}

	@Override
	public void takeOff()
	{
		System.out.println("�����Ⱑ �̷��մϴ�");
		
	}

	@Override
	public void fly()
	{
		System.out.println("�����Ⱑ �����մϴ�");
		
	}
	
	@Override
	public void goUpWater()
	{
		System.out.println("�����Ⱑ ������ �����մϴ�");
		
	}

	@Override
	public void goDownWater()
	{
		System.out.println("�����Ⱑ ���Ʒ��� �����մϴ�");
		
	}
	
}
