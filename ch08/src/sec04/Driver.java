package sec04;

import sec03.exam02.Flyable;
import sec03.exam02.Sailable;

public class Driver
{
	//field
	
	//constructor
	
	//method
	public void driveFly(Flyable flyable)   //Flyable(인터페이스)을 이용할수있는 객체들이 올수있다  ( 클래스일때는 자신또는 자식객체들)
	{
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	
	public void driveShip(Sailable sailable)
	{
		sailable.goUpWater();
		sailable.goDownWater();
	}
}
