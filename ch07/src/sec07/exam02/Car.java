package sec07.exam02;

public class Car
{
	//field
	public Tire tire = new Tire();  //�θ��� Ÿ�̾�
	
	//method
	public void run(Tire tire)   // �ڵ�Ÿ�Ժ�ȯ run(new Tire()); run(new HankookTire()); run(new KumhoTire());
	{
		this.tire = tire;
		tire.roll();    // tire Ŭ������� tireŬ������ roll , hankooktireŬ������� hankooktire�� roll, kumhotireŬ������� kumhotire�� roll
	}
	
}
