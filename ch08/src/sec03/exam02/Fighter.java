package sec03.exam02;

public class Fighter implements Flyable, Sailable
{

	@Override
	public void land()
	{
		System.out.println("전투기가 착륙합니다");
		
	}

	@Override
	public void takeOff()
	{
		System.out.println("전투기가 이륙합니다");
		
	}

	@Override
	public void fly()
	{
		System.out.println("전투기가 비행합니다");
		
	}
	
	@Override
	public void goUpWater()
	{
		System.out.println("전투기가 물위를 항해합니다");
		
	}

	@Override
	public void goDownWater()
	{
		System.out.println("전투기가 물아래로 항해합니다");
		
	}

}
