package sec05.exam01;

public class Bus implements Vehicel
{
	
	@Override
	public void run()
	{
	System.out.println("버스가 달립니다");	
	}
	
	public void checkFare()
	{
		System.out.println("요금가 달립니다");	
	}
}
