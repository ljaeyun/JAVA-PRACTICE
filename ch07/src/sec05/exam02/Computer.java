package sec05.exam02;

public class Computer extends Calculator
{
	@Override
	public void circleArea(double r)
	{
		double result = r * r * Math.PI;
		System.out.println("°á°ú : " + result);
	}
	
	
}
