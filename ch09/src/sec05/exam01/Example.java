package sec05.exam01;

public class Example
{

	public static void main(String[] args)
	{
		Animal a1 = new Dog();
		a1.sound();
		a1.eat();
		
		Animal a2 = new Animal()     //�͸� ��ü  cat Ŭ������ ������ �ʰ� ��ü�� ���� ���  animal ��ü�� �ƴ� �ڽ� ��ü�� ����°�
				{
					public void sound()
					{
						System.out.println("�߿�");
						
					}
				};
		a2.sound();
		System.out.println("");
		
		method(a1);
		method(a2);
		
		method(new Animal() {  // �͸�ü

			@Override
			public void sound()
			{
				System.out.println("���� ���ֱ�");
				
			}
			
		});
		

	}
	
	public static void method(Animal a)  // <- animal�� �߻�ü�̹Ƿ� �ڽİ�ü�� �� �� �ִ� 
	{
		a.eat();
		a.sound();
	}

}
