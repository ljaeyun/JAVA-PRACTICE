package sec04;


// ������ ���� Ŭ����
public class Example 
{

	public static void main(String[] args) 
	{
		//Car ���� ����
		Car myCar = null;
		//Car ��ü ����
		myCar = new Car();
		//Car ���� ����� ���ÿ� Car ��ü ����
		Car yourCar = new Car();
		
		Car mySonCar = myCar; // ���� �ּ� ���� ���� -> ���� ��ü 
		
		//Student ���� ����� ���ÿ� student ��ü ����
		Student s1 = new Student();   //s1 �� ���� ����
		Student s2 = new Student();
		
		//��ü ��
		System.out.println(myCar == yourCar);
		System.out.println(s1 == s2);
		System.out.println(mySonCar == myCar);
		
		
	}

}
