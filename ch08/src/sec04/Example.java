package sec04;

import sec03.exam02.Car;
import sec03.exam02.Fighter;
import sec03.exam02.PassengerPlane;

public class Example
{

	public static void main(String[] args)
	{
		Driver driver = new Driver();
		
		
		Car car = new Car();   // ���� ���� �����ϴ�
		Fighter fighter = new Fighter();
		PassengerPlane pp = new PassengerPlane();
		
		driver.driveFly(new Car());  //�Ű������� �������̽��� �̿밡���� ��ü���� ����ȴ�  
		driver.driveFly(new Fighter());  
		driver.driveFly(new PassengerPlane());
		
		driver.driveFly(car);   
		driver.driveFly(fighter);  
		driver.driveFly(pp);  
		
		driver.driveShip(car);
		
		driver.driveFly(new SmartCar());   // car�� ��ӹ��� smartcar������ ��ü������ ���� �������̽� ���
		driver.driveShip(new SmartCar());
	}

}
