package sec04;

import sec03.exam02.Car;
import sec03.exam02.Fighter;
import sec03.exam02.PassengerPlane;

public class Example
{

	public static void main(String[] args)
	{
		Driver driver = new Driver();
		
		
		Car car = new Car();   // 직접 선언도 가능하다
		Fighter fighter = new Fighter();
		PassengerPlane pp = new PassengerPlane();
		
		driver.driveFly(new Car());  //매개변수로 인터페이스로 이용가능한 객체들이 오면된다  
		driver.driveFly(new Fighter());  
		driver.driveFly(new PassengerPlane());
		
		driver.driveFly(car);   
		driver.driveFly(fighter);  
		driver.driveFly(pp);  
		
		driver.driveShip(car);
		
		driver.driveFly(new SmartCar());   // car를 상속받은 smartcar에서도 객체선언을 통해 인터페이스 출력
		driver.driveShip(new SmartCar());
	}

}
