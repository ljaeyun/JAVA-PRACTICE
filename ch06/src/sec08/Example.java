package sec08;

public class Example 
{

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		// �޼ҵ� ȣ��
		cal.print();
		cal.print("hello");
		cal.print("hello", 18);

		byte b1 = 3;  // cal.plus�� �Ű������� ���� ����
		long var3 = 20 ; // cal.plus �� �Ű������� ���� �Ұ��� 
		//int result = cal.plus((int)var3, y); // ���� ����ȯ���� ���� ���������� �� �ս� ���ɼ� �ִ�
		int result = cal.plus(3, 5);
		System.out.println("result : " + result);
		
		String result2 = cal.join("010", "123456");
		System.out.println("result2 : " + result2);
		
		
		int[] arr = {1,2,4,5};
		int result3 = cal.sum(arr);
		System.out.println(result3);
		
		
		int[] arr2 = {1,2,4,5};
//		int result4 = cal.sum2(arr2);
		
		int result4 = cal.sum2(90, 80, 80 );  //�迭�� �ƴ����� �迭�� ��������� �Ű������� ����
		System.out.println(result4);
		
		
		Car car= new Car();
		//car.speed = 10; // private�� ���� ���� �Ұ���
		car.setSpeed(-10);
		car.run(10);
	}

}
