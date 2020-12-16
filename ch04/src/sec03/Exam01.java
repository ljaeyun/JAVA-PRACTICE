package sec03;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//반복문 : for 를 알아보자
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		// 구구단
		
		for(int i = 1 ; i <= 9 ; i++)
		{
			for(int j = 2 ; j <= 9 ; j++)
			{
				System.out.println(j + "*" + i + "=" + i*j);
			}
			System.out.println();
		}
		
		// 구구단 수평으로 출력
		for(int m = 2 ; m <= 9 ; m++)
		{
			for(int n = 1 ; n <= 9 ; n++)
			{
				System.out.print(n + "*" + m + "=" + m*n + '\t'); // println 자동 줄바꿈 출력 , print 자동 줄바꿈 없이 출력
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
		 *위랑 같은 결과값
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
