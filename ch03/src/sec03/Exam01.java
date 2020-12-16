package sec03;

public class Exam01 
{

	public static void main(String[] args) 
	{
		//단항 연산자(++, --, +=, -=, *=, /=, !)
		
		// 증감 연산자에 대해 알아보자
		int var1 = 1;
		// 1 씩 증가
		
		var1++; // 파이썬에는 증감연산자가 없다
		
		++var1;
		
		System.out.println("var1 : " + var1);
		
		
		var1--;
		
		--var1;
		
		System.out.println("var1 : " + var1);
		
		//다른 연산자와 같이 사용할 경우 주의
		int var2 = 1;
		int var3 = var2++ + 5;
		
		System.out.println("var3 : " + var3);
		
		//원래 값을 변수의 값을 변경하는 연산식
		int var4 = 1;
		var4 += 3; //var4 = var4 + 3;
		var4 -= 3;
		var4 *= 3;
		var4 /= 3;
		
		//논리값을 부정하는 연산식
		boolean var5 = false;
		boolean var6 = !var5; 
		
		
		
		
		System.out.println(var6);

	}

}
