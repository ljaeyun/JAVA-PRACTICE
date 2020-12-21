package sec13;

public class B {

	//Field 
	A a = new A();   //다른 클래스 객체 선언  필드로도 선언 가능  B객체가 있으면 필드가 유지 되지만 객체가 사라지면 같이 사라짐
	//a.field = 3;  // 에러 발생 클래스 블록에서는 선언만 가능하고 실행문은 불가능하다 ( 변수에 값을 저장)
	
	
	
	//Constructor  생성자로도 선언 사용 가능
	B()
	{
		A a2 = new A();   //블록 안에서만 쓸수있는 변수
		a2.field = 5;
	}

	
	//Method 메서드로도 선언 사용가능
	
	void method()
	{
		A a3 = new A();
		a3.m1();
	}
}
