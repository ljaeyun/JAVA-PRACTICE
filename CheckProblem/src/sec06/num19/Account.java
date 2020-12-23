package sec06.num19;

public class Account
{
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	int balance;
	
	//setter
	public void setBalance(int balance)
	{
		if(balance> 1000000)
		{
			
		}
		else if(balance < 0)
		{
			
		}
		else
		{
			this.balance = balance;
		}
		
	}
	
	//getter
	public int getBalance()
	{
		return balance;
	}
	
}
