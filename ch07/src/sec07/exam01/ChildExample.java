package sec07.exam01;

public class ChildExample
{

	public static void main(String[] args)
	{
		Child child = new Child();
		child.method1();  // �θ� Ŭ������ �޼��� ȣ��
		child.method2();  // �������̵��Ȱ��� ȣ��
		child.method3();

		System.out.println();
		
		Parent parent = child;  //�ڵ�Ÿ�Ժ�ȯ
		parent.method1();
		parent.method2();
	}

}
