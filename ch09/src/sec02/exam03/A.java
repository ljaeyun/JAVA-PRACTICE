package sec02.exam03;

public class A
{
	//field
	
	//constructor
	public A()
	{
		class B  //로컬 클래스 B는 생성자 A에서만 사용가능
		{
			
		}
		
		B b = new B();
	}
	
	
	//method
	public void method()
	{
		class B  // 메서드 안에서만 사용가능
		{
			
		}
		
		B b = new B();
	}
}
