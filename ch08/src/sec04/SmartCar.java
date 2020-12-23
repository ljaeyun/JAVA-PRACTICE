package sec04;

import sec03.exam02.Car;

public class SmartCar extends Car   //Car라고 하는 부모가 flyable sailable을 인터페이스가 사용가능하기 때문에 자식도 사용가능하다
{
	@Override
	public void fly()
	{ 
		System.out.println("SmartCar가 비행합니다");
	}
	
	@Override
	public void goUpWater()
	{
		System.out.println("SmartCar가 바다 위를 항해합니다");
	}
}
