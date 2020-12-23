package sec06.package2;

import sec06.package1.A;

public class C extends A   //상속을 통해 protected된 필드 생성자 메서드 사용가능
{
	//field
	
	//constructor
	
	//method
	public void method1()
	{
		field1 = "겨울";    // protected로 인해 상속으로만 쓸수있도록 한다
		method();  //클래스 a의 method
	}
	
	public void method2()
	{
		//A a = new A();   //protected 에러
		field1 = "겨울";    // protected
	}
}
