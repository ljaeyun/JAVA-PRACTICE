package sec06.num17;

public class Printer  // static 정적 필드와 정적메서드를 통해 메모리에 바로 올려 객체생성없이 사용가능
{
	static int num;
	static boolean result;
	static double num2;
	static String text;
	
	
	static void println(int num)
	{
		System.out.println(num);
	}
	
	static void println(boolean result)
	{
		System.out.println(result);
	}

	static void println(double num2)
	{
		System.out.println(num2);
	}
	
	static void println(String text)
	{
		System.out.print(text);
	}
	
	
}
