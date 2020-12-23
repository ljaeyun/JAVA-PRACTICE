package sec07.exam04;

public class ChildExample
{

	public static void main(String[] args)
	{
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		//parent.method3(); // child에 3이 있지만 parent 타입으로는 2까지만 가능하다
		
		Child child = (Child) parent;
		
		System.out.println();
		child.method1();
		child.method2();
		child.method3(); // 타입 강제변환

	}

}
