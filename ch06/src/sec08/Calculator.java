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
			System.out.println("�⺻ ���� ���");
			if(i == 2)
				//break;  // for ���� ���� �޼��� ����� ����
				return; // �޼��带 ����
		}
		System.out.println("����Ʈ �Ϸ�");
	}
	
	void print(String message)
	{
		System.out.println(message);
	}
	
	void print(String message, int temp)
	{
		System.out.println(message);
		System.out.println("�µ� : " + temp);
	}
	
	int plus(int x, int y)  // �Ű������� Ÿ���� ��õ� Ÿ�Ժ��� ���� Ÿ�������� �־ ����� ���� EX) byte x, byte y 
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
	
	int sum2(int ... arr)   // (int[] arr) == (int ... arr)    ������ �𸣴� �Ű����� �ü� �ִ� 
	{
		int sum = 0;
		for(int value : arr)
		{
			sum += value;
		}
		return sum;
	}
	
}
