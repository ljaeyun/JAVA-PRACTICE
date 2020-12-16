package sec04;

public class num04 
{

	public static void main(String[] args) 
	{
// 		int num = (int)(Math.random() * 6) + 1; 주사위 랜덤 숫자
		
		boolean conti = true;
		while(conti)
		{
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("("+num1 +", " +num2+")");
			
			if((num1 + num2) == 5)
				break;
		}

	}

}
