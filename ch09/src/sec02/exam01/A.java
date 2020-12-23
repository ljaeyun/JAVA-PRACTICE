package sec02.exam01;

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
	class B  // a 객체없이는 b 사용불가능  // 필드안에서 생성되었기때문에 어디에서든 사용가능
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
