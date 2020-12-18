package sec09;

public class CalculatorSample 
{

	public static void main(String[] args) 
	{
		//바람직스러운 코드
		double area1 = 5 * 5 * Calculator.pi;
		double area3 = Calculator.circleArea(5);
		System.out.println(area1);
		System.out.println(area3);
		
		
		//바람직하지 않은 코드
		Calculator calc = new Calculator();
		double area2 = 5 * 5 * calc.pi;		// 에러는 아니지만 바람직스럽지 않다. 객체를 만들어서 사용하기 때문
		double area4 = calc.circleArea(5);  //
		System.out.println(area2);

	}

}
