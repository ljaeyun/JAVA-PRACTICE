package sec07.exam01;

public class ChildExample
{

	public static void main(String[] args)
	{
		Child child = new Child();
		child.method1();  // 부모 클래스의 메서드 호출
		child.method2();  // 오버라이딩된것이 호출
		child.method3();

		System.out.println();
		
		Parent parent = child;  //자동타입변환
		parent.method1();
		parent.method2();
	}

}
