package sec02.exam02;

public class A
{
	//field
	B b1 = new B();
	
	//constructor
	public A()
	{
		B b2 = new B();
		b2.methodB();
		b1.methodB();
	}
	
	//method
	void method()
	{
		B b3 = new B();
		b3.methodB();
		b1.methodB();
	}
	
	//nested ��ø
	static class B   //a ��ü�� ��� b ��밡��
	{
		//field
		
		//constructor
		
		//method
		void methodB()
		{
			System.out.println("methodb() is running");
		}
	}
}
