package sec04;

import sec03.exam02.Car;

public class SmartCar extends Car   //Car��� �ϴ� �θ� flyable sailable�� �������̽��� ��밡���ϱ� ������ �ڽĵ� ��밡���ϴ�
{
	@Override
	public void fly()
	{ 
		System.out.println("SmartCar�� �����մϴ�");
	}
	
	@Override
	public void goUpWater()
	{
		System.out.println("SmartCar�� �ٴ� ���� �����մϴ�");
	}
}
