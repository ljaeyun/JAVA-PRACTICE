package sec02;

public class Exam01 
{

	public static void main(String[] args)
	{
		//타입의 종류를 알아보자
		
		//정수 타입의 종류
		byte var1 = 10;
		short var2 = 4000;
		int var3 = 10;
		long var4 = 10;
		long var41 = 5000000000L; // 자바는 숫자를 기본적으로 int 의 범위로 생각함로 int 의 범위를 넘는 long 의 경우 L을 붙여서 타입 명시
		
		//실수(소수점) 타입의 종류를 알아보자
		float var5 = 3.123456712345678F;
		double var6 = 3.12345671234567;
		System.out.println(var5);
		System.out.println(var6);
		//double 이 더욱 정밀한 소수를 표현할 수 있다
		
		//문자 타입을 알아보자
		char var7 = 'A'; // ' ' 반드시 문자 한개만
		System.out.println(var7);
		//문자열 타입을 알아보자
		String var8 = "ABC";
		System.out.println(var8);
		

		//논리 타입 (true, false)
		boolean var9 = true;
		boolean var10 = false;
	}

}
