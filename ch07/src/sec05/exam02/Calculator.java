package sec05.exam02;

public class Calculator
{
	public void circleArea(double r)
	{
		double result = r * r * 3.14;
		System.out.println("��� : " + result);
	}
	
	public final void rectangleArea(double width, double height) // final -> ������ ����  ������ �������Ҷ� ���� �߻�
	{
		double result = width * height;
		System.out.println("��� : " + result);
	}
}
