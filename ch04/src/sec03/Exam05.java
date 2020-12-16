package sec03;

public class Exam05 
{

	public static void main(String[] args) 
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			if(i%3 != 0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		// 1 부터 100까지 합을 구하는데 최소 300이 되는 그 때의 수는??
		
		int count = 1;
		int sum = 0;
		while(true)
		{
			
			sum += count;
			
			if(sum >= 300)
			{
				break;
			}
			count++;
		}
		System.out.println(count);
		System.out.println(sum);

	}

}
