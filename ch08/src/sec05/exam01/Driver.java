package sec05.exam01;

public class Driver
{
	public void drive(Vehicel vehicle)
	{
		vehicle.run();
		
		if(vehicle instanceof Bus)
		{
			Bus bus = (Bus) vehicle;
		}
		//else if (vehicle instanceof Taxi)
		{
			
		}
		
	}
	
}
