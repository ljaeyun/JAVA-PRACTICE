package sec05.exam02;

public class Example
{

	public static void main(String[] args)
	{
		//////////////////
		RemoteControl rc1 = new Tv();  //����Ʈ ��Ʈ�ѷ� tv�� ����ϰڴ�
		rc1.turnOn();
		//////////////////
		RemoteControl rc2 = new RemoteControl() 
		{

			@Override
			public void turnOn()
			{
				System.out.println("audio�� �����ϴ�");
				
			}
		};
		rc2.turnOn();
		//////////////////
		//method(rc1);
		//method(rc2);
		method(new RemoteControl()  // ��Ʈ�� + �����̽��� �ڵ� ���� ����
		{
			
			@Override
			public void turnOn()
			{
				System.out.println("����Ⱑ �����ϴ�");
				
			}
		});
	}
	
	public static void method(RemoteControl rc)  //����Ʈ��Ʈ���� ��ü�� �ڽİ�ü��
	{
		rc.turnOn();
	}

}
