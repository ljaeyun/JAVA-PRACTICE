package sec07;

public class Example01 
{

	public static void main(String[] args) 
	{
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		
		// �Ű���
		Car yourCar = new Car("��");  // ��ü�� �����Ҷ� �Ű������� ����
		System.out.println(yourCar.company);
		
		Car notCar = new Car(2);
		System.out.println(notCar.speed);
	}

}
