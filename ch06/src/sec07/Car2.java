package sec07;


public class Car2 
{

	//Field
	String company;
	int speed;
	Tire tire;
	boolean navi;
	
	
	//������ �����ε�  �Ű������� Ÿ���� �޶���Ѵ�, ������ ������ �޶���Ѵ�
	//Constructor  ��ü�� ���鶧
	public Car2()
	{
		this(0, "����"); //public Car2(int speed, String company) �� ����� (����)
	}
	
	public Car2(String company) // �Ű�����
	{
		this(0, company); //public Car2(int speed, String company) �� ����� (����)
	}
	
	public Car2(int speed)
	{
		this(speed, "����"); //public Car2(int speed, String company) �� ����� (����)
	}
	
	public Car2(String company, int speed)
	{
		this(speed, company); //���� ��ü�� �����ϰ� �ִ� ������ ȣ�� //public Car2(int speed, String company) �� ����� (����)
	}
	
	public Car2(int speed, String company)
	{
		this.company = company;
		this.speed = speed;
		tire = new Tire();
		navi = true;
	}
	
}

