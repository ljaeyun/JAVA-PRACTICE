package sec03;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//�ݺ��� : for �� �˾ƺ���
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		// ������
		
		for(int i = 1 ; i <= 9 ; i++)
		{
			for(int j = 2 ; j <= 9 ; j++)
			{
				System.out.println(j + "*" + i + "=" + i*j);
			}
			System.out.println();
		}
		
		// ������ �������� ���
		for(int m = 2 ; m <= 9 ; m++)
		{
			for(int n = 1 ; n <= 9 ; n++)
			{
				System.out.print(n + "*" + m + "=" + m*n + '\t'); // println �ڵ� �ٹٲ� ��� , print �ڵ� �ٹٲ� ���� ���
			}
			System.out.println();
		}
		
		System.out.println();

		
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("^");
			}
			System.out.println();
		}
		/*
		 *���� ���� �����
		for(int i = 5 ; i > 0 ; i--)
		{
			for(int j = 5 ; j >= i ; j--)
			{
				System.out.print("^");
			}
			System.out.println();
		}
		*/
		
		System.out.println();
		
		for(int i = 5 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print("^");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 0 ; j < 4 - i ; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
		
	}

}
