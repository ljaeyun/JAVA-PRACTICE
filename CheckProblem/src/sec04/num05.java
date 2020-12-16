package sec04;

public class num05 
{

	public static void main(String[] args) 
	{
		// 4x + 5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력하세요
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			for(int j = 1 ; j <= 10 ; j++)
			{
				if(((4*i) + (5*j)) == 60)
				{
					System.out.println("("+ i +", " + j +")");
				}
			}
		}

	}

}
