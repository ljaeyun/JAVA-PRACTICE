package sec04;

import sec03.exam02.Flyable;
import sec03.exam02.Sailable;

public class Driver
{
	//field
	
	//constructor
	
	//method
	public void driveFly(Flyable flyable)   //Flyable(�������̽�)�� �̿��Ҽ��ִ� ��ü���� �ü��ִ�  ( Ŭ�����϶��� �ڽŶǴ� �ڽİ�ü��)
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
