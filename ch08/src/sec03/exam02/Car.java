package sec03.exam02;

public class Car implements Flyable , Sailable  // ���� �������̽� flayble �� sailable�� ������ car�� ����ڴ� 
{

	@Override
	public void land()
	{
		System.out.println("���� �����մϴ�");
		
	}

	@Override
	public void takeOff()
	{
		System.out.println("���� �̷��մϴ�");
		
	}

	@Override
	public void fly()
	{
		System.out.println("���� �����մϴ�");
		
	}

	@Override
	public void goUpWater()
	{
		System.out.println("�ڵ����� ������ �����մϴ�");
		
	}

	@Override
	public void goDownWater()
	{
		System.out.println("�ڵ����� ���Ʒ��� �����մϴ�");
		
	}
}
