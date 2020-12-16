package sec04;

public class num03 
{

	public static void main(String[] args) 
	{
		//3의 배수의 합을 구하라
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++)
		{
			if(i % 3 == 0)
			{
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합 : " + sum);

	}

}
