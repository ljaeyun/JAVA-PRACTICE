package sec06;

public class Exam11 
{

	public static void main(String[] args) 
	{
		int [] scores = {42,64,15};
		
		int sum = 0;
		for(int i : scores)
		{
			sum += i;
			
		}

		System.out.println((double)sum / scores.length);
		
		String[] names = {"��", "��", "��", "��"};
		for(String na : names) 
		{
			System.out.println(na);
			if(na.equals("��"))
			{
				break;
			}
		}
	}

}
