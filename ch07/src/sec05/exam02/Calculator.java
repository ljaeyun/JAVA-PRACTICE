package sec05.exam02;

public class Calculator
{
	public void circleArea(double r)
	{
		double result = r * r * 3.14;
		System.out.println("결과 : " + result);
	}
	
	public final void rectangleArea(double width, double height) // final -> 재정의 금지  강제로 재정의할때 에러 발생
	{
		double result = width * height;
		System.out.println("결과 : " + result);
	}
}
