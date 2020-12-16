package sec02;

public class Exam01 
{
	public static void main(String[] args)
	{
		boolean run = false;
		int speed = 120;
		int gas = 100;
		
		System.out.println("1");
		
		if(run)
		{
			System.out.println("2");
			System.out.println("3");
		}
		if(speed == 0)
		{
			System.out.println("4");
		}
		else
		{
			System.out.println("5");	
		}
		
		
		if(speed <= 60)
		{
			gas-=1;
		}
		else if(speed <= 80)
		{
			gas -=2;
		}
		else if(speed <= 100)
		{
			gas -=10;
		}
		else
		{
			gas -=20;
		}
		
		System.out.println("가스의 양은 : " + gas);
		
		
		
	}
	
		
	
}
