package sec13;

public class A {
	//Field
	public int field; // 같은 패키지뿐만 아니라 다른 패키지에서도 가능하다
	
	//Constructor
	public A()  // 같은클래스 밖에서 참조 불가능
	{
		m1(); //생성자 안에서도 호출가능
	}
	
	
	//Method
	public void m1() 
	{
		System.out.println("method() 실행됨");
	}
	
	public void m2() 
	{
		m1();  //다른 메서드 안에서도 호출이 가능하다
	}
}
