package sec03.exam02;

public class Example
{

	public static void main(String[] args)
	{
		//Flyable fa = new PassengerPlane(); //Flyable �� �������̽� �̹Ƿ� Car Fighter PassengerPlaen ����
		
		
		Flyable fa = new Car();
		fa.takeOff();
		fa.fly();
		fa.land();

		Sailable sa = new Car();
		sa.goUpWater();
		sa.goDownWater();
				
	}

}
