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
		
		
		// 1 ���� 100���� ���� ���ϴµ� �ּ� 300�� �Ǵ� �� ���� ����??
		
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
