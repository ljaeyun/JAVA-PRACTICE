package sec03.exam01;

public class Example
{

	public static void main(String[] args)
	{
		//Flyable fa = new PassengerPlane(); //Flyable 이 인터페이스 이므로 Car Fighter PassengerPlaen 가능
		
		
		Flyable fa = new Car();
		fa.takeOff();
		fa.fly();
		fa.land();
		
		Flyable fa2 = new Fighter(); //인터페이스에 객체만 바꾸어주면 바로 사용이 가능
		fa2.takeOff();
		fa2.fly();
		fa2.land();
		

	}

}
