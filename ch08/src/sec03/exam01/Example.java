package sec03.exam01;

public class Example
{

	public static void main(String[] args)
	{
		//Flyable fa = new PassengerPlane(); //Flyable �� �������̽� �̹Ƿ� Car Fighter PassengerPlaen ����
		
		
		Flyable fa = new Car();
		fa.takeOff();
		fa.fly();
		fa.land();
		
		Flyable fa2 = new Fighter(); //�������̽��� ��ü�� �ٲپ��ָ� �ٷ� ����� ����
		fa2.takeOff();
		fa2.fly();
		fa2.land();
		

	}

}
