package sec08;

public class Car 
{
	//field
	
	private int speed; // private ��ü �ȿ�����
	
	//constructor
	Car()
	{
		setSpeed(0); // ���� Ŭ���� ���ο����� �޼��带 ȣ���Ҷ� �̸��� �ᵵ ȣ�Ⱑ��
	}
	
	
	//method
	
	public void setSpeed(int speed) // public �ܺο� ����
	{
		if(speed < 0)
		{
			this.speed = 0;
		}
		else
		{
			this.speed = speed;
		}
	}
	
	public void run(int value)
	{
		//speed++;
		// speed = value; // ������ �� �� ������ �޼���� ó��
		setSpeed(value);
		
	}
}
