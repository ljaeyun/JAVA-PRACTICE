package sec08;

public class Example 
{

	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		// 메소드 호출
		cal.print();
		cal.print("hello");
		cal.print("hello", 18);
		
		int result = cal.plus(3, 5);
		System.out.println("result : " + result);
		
		String result2 = cal.join("010", "123456");
		System.out.println("result2 : " + result2);
	}

}
