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
	
	//nested 중첩
	static class B   //a 객체가 없어도 b 사용가능
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
