package sec13;

public class A {
	//Field
	public int field; // ���� ��Ű���Ӹ� �ƴ϶� �ٸ� ��Ű�������� �����ϴ�
	
	//Constructor
	public A()  // ����Ŭ���� �ۿ��� ���� �Ұ���
	{
		m1(); //������ �ȿ����� ȣ�Ⱑ��
	}
	
	
	//Method
	public void m1() 
	{
		System.out.println("method() �����");
	}
	
	public void m2() 
	{
		m1();  //�ٸ� �޼��� �ȿ����� ȣ���� �����ϴ�
	}
}
