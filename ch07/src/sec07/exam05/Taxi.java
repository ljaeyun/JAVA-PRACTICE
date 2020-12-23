package sec07.exam05;

public class Taxi extends Vehicle
{
	//field
	
	//constructor
	
	//method
	@Override
	public void run()
	{
		System.out.println("Taxi가 달립니다");
	}
	
	public void payTaxiFare()
	{
		System.out.println("카드로 요금을 냅니다");
	}
}
