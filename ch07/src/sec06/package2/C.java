package sec06.package2;

import sec06.package1.A;

public class C extends A   //����� ���� protected�� �ʵ� ������ �޼��� ��밡��
{
	//field
	
	//constructor
	
	//method
	public void method1()
	{
		field1 = "�ܿ�";    // protected�� ���� ������θ� �����ֵ��� �Ѵ�
		method();  //Ŭ���� a�� method
	}
	
	public void method2()
	{
		//A a = new A();   //protected ����
		field1 = "�ܿ�";    // protected
	}
}
