package sec04;

public class SportsCar extends Car
{
	//field
	
	//constructor
		
	//method  �޼��� �������̵� 
//	@Override      // �޼��� �������̵��� ����� �Ǿ����� Ȯ�����ش�. �� ǥ�� �� ������ �޼��尡 �θ𿡵� �Ȱ����� �ִ��� Ȯ�� 
//	public void run()
//	{
//		super.run();  // �θ� ������ �ִ� run�� �����ϰڴ�
//		System.out.println("SportsCar �� run() ����");
//		
//		super.run();  // ���� �ٿ��� ����� ����
//	}
	@Override   //ctrl + space �� ������ �޼��带 �������ָ� �ڵ� �������̵� �����ϴ�  �θ𺸴� �� ���� ���� ������ �� �� ����
	public void run()
	{
		
		System.out.println("SportsCar �� run() ����");
		super.run();
	}
}
