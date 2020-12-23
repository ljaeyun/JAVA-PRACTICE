package sec03.exam01;

public class PassengerPlane implements Flyable
{

	@Override
	public void land()
	{
		System.out.println("여객기가 착륙합니다");
		
	}

	@Override
	public void takeOff()
	{
		System.out.println("여객기가 이륙합니다");
		
	}

	@Override
	public void fly()
	{
		System.out.println("여객기가 비행합니다");
		
	}
	
}
