package sec07.exam04;

public class ChildExample
{

	public static void main(String[] args)
	{
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		//parent.method3(); // child�� 3�� ������ parent Ÿ�����δ� 2������ �����ϴ�
		
		Child child = (Child) parent;
		
		System.out.println();
		child.method1();
		child.method2();
		child.method3(); // Ÿ�� ������ȯ

	}

}
