package sec03;

public class num06 
{

	public static void main(String[] args) 
	{
		// 사다리꼴의 넓이를 구하는 코드에서 정확히 소수자릿수가 나올 수 있도록 하시오
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2;
				
		System.out.println(area);

	}

}
