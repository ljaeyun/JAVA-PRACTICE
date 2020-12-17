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
		System.out.println("기본 내용 출력");
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
	
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	String join(String s1, String s2)
	{
		String result = s1 + "-" + s2;
		return result;
	}
	
}
