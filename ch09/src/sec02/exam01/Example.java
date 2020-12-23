package sec02.exam01;

public class Example
{

	public static void main(String[] args)
	{
		A a = new A();    //A의 객체 a를 가지고 B에 접근
		//A.B b = new A.B();  에러
		A.B b = a.new B();

	}

}
