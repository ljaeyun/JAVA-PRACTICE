package sec07;


public class Car 
{

	//Field
	String company = "kia";
	int speed;
	double speed2;
	Tire tire = new Tire();
	boolean navi = true;
	
	
	//������ �����ε�  �Ű������� Ÿ���� �޶���Ѵ�, ������ ������ �޶���Ѵ�
	//Constructor  ��ü�� ���鶧
	public Car()
	{
		System.out.println("Car() �����");
	}
	
	public Car(String company) // �Ű�����
	{
		System.out.println("Car(String company) �����");
		this.company = company;  // this ���� ��ü�� �ʵ忡 �����ҷ����Ҷ� ���
	}
	
	public Car(int speed)
	{
		System.out.println("Car(int speed) �����");
		this.speed = speed;
	}
	
	public Car(String company, int speed)
	{
		System.out.println("Car(String company, int speed) �����");
		this.speed = speed;
		this.company = company;
	}
	
	public Car(int speed, String company)
	{
		System.out.println("Car(int speed, String company) �����"); 
		this.speed = speed;
		this.company = company;
	}
	
	public Car(double speed)
	{
		System.out.println("Car(int speed) �����");
		this.speed2 = speed;
	}
	//

}

