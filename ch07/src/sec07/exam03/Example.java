package sec07.exam03;

public class Example
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
	}

}
