package sec07.exam02;

public class Example
{

	public static void main(String[] args)
	{
		Car myCar = new Car();
		myCar.tire.roll();
		
		myCar.tire = new HankookTire();  //�ڽ��� ���ԵǾ� �����ǵ� ���� ���
		myCar.tire.roll();  // �ڵ尡�Ȱ����� �������� �ٸ��� ������
		
		myCar.tire = new KumhoTire();
		myCar.tire.roll();
		
		//�Ű������� ������   �Ű������� �ٸ� �ڽİ�ü�� �ִ� �Ϳ� ���� �������� �޶�����
		System.out.println();
		
		myCar.run(new Tire());
		myCar.run(new HankookTire());
		myCar.run(new KumhoTire());
	} 

}
