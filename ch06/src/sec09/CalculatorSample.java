package sec09;

public class CalculatorSample 
{

	public static void main(String[] args) 
	{
		//�ٶ��������� �ڵ�
		double area1 = 5 * 5 * Calculator.pi;
		double area3 = Calculator.circleArea(5);
		System.out.println(area1);
		System.out.println(area3);
		
		
		//�ٶ������� ���� �ڵ�
		Calculator calc = new Calculator();
		double area2 = 5 * 5 * calc.pi;		// ������ �ƴ����� �ٶ��������� �ʴ�. ��ü�� ���� ����ϱ� ����
		double area4 = calc.circleArea(5);  //
		System.out.println(area2);

	}

}
