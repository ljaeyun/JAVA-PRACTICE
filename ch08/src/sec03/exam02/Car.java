package sec03.exam02;

public class Car implements Flyable , Sailable  // 다중 인터페이스 flayble 과 sailable이 가능한 car를 만들겠다 
{

	@Override
	public void land()
	{
		System.out.println("차가 착륙합니다");
		
	}

	@Override
	public void takeOff()
	{
		System.out.println("차가 이륙합니다");
		
	}

	@Override
	public void fly()
	{
		System.out.println("차가 비행합니다");
		
	}

	@Override
	public void goUpWater()
	{
		System.out.println("자동차가 물위를 항해합니다");
		
	}

	@Override
	public void goDownWater()
	{
		System.out.println("자동차가 물아래로 항해합니다");
		
	}
}
