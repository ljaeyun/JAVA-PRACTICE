package sec04;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//산술 연산(+, -, *, /)시 주의할 점
		
		//long이 아닌 정수의 변수 연산의 결과는 int 값이다.
		byte var1 = 1;
		byte var2 = 2;
		// byte var3 = var1 + var2;    // int var4 = var1 + var2; 가능하면 int 형으로 
		byte var4 = 1 + 2;

		
		//long 변수의 연산의 결과는 long 이다.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		
		
		//정수의 나눗셈은 정수다
		int var8 = 10;
		int var9 = 4;
		double var10 = var8 / var9;
		System.out.println(var10);
		
		//소수점 이하를 얻고 싶으면 실수 연산식으로 변경
		//double var11 = 1.0 * var8 / var9;
		double var11 = (double)var8 / var9;
		System.out.println(var11);
		
		//나머지를 구하는 방법
		int var12 = var8 % var9;
		System.out.println(var12);
	}

}
