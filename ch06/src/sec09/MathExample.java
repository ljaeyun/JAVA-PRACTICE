package sec09;

public class MathExample 
{

	public static void main(String[] args) 
	{
		double r = 5; //반지름 
		
		double area = r * r * Math.PI;
		System.out.println(area);
		
		
		double area2 = Math.pow(r, 2) * Math.PI;
		System.out.println(area2);
		
		
		double value = 12.345;
		long result = Math.round(value);  // round 의 리턴타입이 long 이기 때문에 long 변수 선언
		System.out.println(result);
		

	}

}
