package sec06;

public class Example 
{

	public static void main(String[] args) 
	{
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.tire);
		System.out.println(myCar.navi);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
		
		
		Car yourCar = new Car();
		yourCar.speed = 60;
		System.out.println(yourCar.speed);  // ���ο� ��ü ����  ��ü���� ���ο� �ʵ�
		
		
		
	}

}
