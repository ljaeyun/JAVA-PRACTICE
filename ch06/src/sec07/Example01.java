package sec07;

public class Example01 
{

	public static void main(String[] args) 
	{
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		
		// 매개값
		Car yourCar = new Car("쉐");  // 객체를 생성할때 매개변수로 변경
		System.out.println(yourCar.company);
		
		Car notCar = new Car(2);
		System.out.println(notCar.speed);
	}

}
