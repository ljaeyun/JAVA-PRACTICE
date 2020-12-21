package sec03.exam01;

public class Child extends Parent
{
	//Field
	int field2;
	
	//Constructor
	
	public Child()
	{
		super();       
	}    // 명시하지 않아도 자동으로 생성
	
	//Method
	void method2()
	{
		System.out.println("메서드2 실행중");
	}
}
