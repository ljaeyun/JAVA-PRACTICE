package sec05.exam01;

public class Example
{

	public static void main(String[] args)
	{
		Vehicel v = new Bus();
		
		v.run();
		
		Bus bus = (Bus) v;
		bus.checkFare();
		
		Driver dri = new Driver();
		dri.drive(new Bus());

	}

}
