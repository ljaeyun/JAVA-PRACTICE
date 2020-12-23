package sec07.exam05;

public class Driver
{
	//field
	
	//constructor
	
	//method
	public void drive(Vehicle vehicle)
	{
		if(vehicle instanceof Bus)
		{
			Bus bus = (Bus) vehicle;
			bus.payBusFare();
		}
		else if(vehicle instanceof Taxi)
		{
			Taxi taxi = (Taxi) vehicle;
			taxi.payTaxiFare();
		}
		vehicle.run();
	}
}
