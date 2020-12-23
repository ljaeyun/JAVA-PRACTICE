package sec03.exam02;

public class Example
{

	public static void main(String[] args)
	{
		//Flyable fa = new PassengerPlane(); //Flyable 이 인터페이스 이므로 Car Fighter PassengerPlaen 가능
		
		
		Flyable fa = new Car();
		fa.takeOff();
		fa.fly();
		fa.land();

		Sailable sa = new Car();
		sa.goUpWater();
		sa.goDownWater();
				
	}

}
