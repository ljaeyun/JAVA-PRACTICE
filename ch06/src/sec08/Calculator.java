package sec08;

public class Calculator 
{
	//Field
	
	
	//Constructor
	Calculator()
	{
		
	}
	
	
	//Method
	void print()
	{
		for(int i = 0 ; i < 5; i++)
		{
			System.out.println("기본 내용 출력");
			if(i == 2)
				//break;  // for 문만 종료 메서드 종료는 못함
				return; // 메서드를 종료
		}
		System.out.println("프린트 완료");
	}
	
	void print(String message)
	{
		System.out.println(message);
	}
	
	void print(String message, int temp)
	{
		System.out.println(message);
		System.out.println("온도 : " + temp);
	}
	
	int plus(int x, int y)  // 매개변수의 타입은 명시된 타입보다 작은 타입형으로 주어도 상관이 없다 EX) byte x, byte y 
	{
		int result = x + y;
		return result;
	}
	
	String join(String s1, String s2)
	{
		String result = s1 + "-" + s2;
		return result;
	}
	
	int sum(int[] arr) 
	{
		int sum = 0;
		for(int value : arr)
		{
			sum += value;
		}
		return sum;
	}
	
	int sum2(int ... arr)   // (int[] arr) == (int ... arr)    개수를 모르는 매개값이 올수 있다 
	{
		int sum = 0;
		for(int value : arr)
		{
			sum += value;
		}
		return sum;
	}
	
}
