package sec04;

public class Exam02 
{

	public static void main(String[] args) 
	{
		//비교 연산자
		
		//1.숫자 비교
		int var1 = 3;
		int var2 = 4;
		boolean var3 = var1 == var2; // !=
		System.out.println("var3 : " + var3);
		
		//2.문자열 비교
		String var4 = "java";
		String var5 = "Java";
		boolean var6 = var4.equals(var5);
		boolean var7 = !var4.equals(var5);
		
		
		//3.대소비교
		int var8 = 3;
		int var9 = 2;
		
		boolean var10 = var8 >= var9;
		//부정 boolean var10 = var8 <= var9; or boolean var10 = !(var8 >= var9);
		System.out.println("var10 : " + var10);

	}

}
