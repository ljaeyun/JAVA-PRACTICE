package sec02.exam01;

public class Example
{

	public static void main(String[] args)
	{
		A a = new A();    //A�� ��ü a�� ������ B�� ����
		//A.B b = new A.B();  ����
		A.B b = a.new B();

	}

}
